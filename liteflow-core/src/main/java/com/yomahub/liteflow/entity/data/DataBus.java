/**
 * <p>Title: liteflow</p>
 * <p>Description: 轻量级的组件式流程框架</p>
 * @author Bryan.Zhang
 * @email weenyc31@163.com
 * @Date 2020/4/1
 */
package com.yomahub.liteflow.entity.data;

import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataBus {

	private static final Logger LOG = LoggerFactory.getLogger(DataBus.class);

	public static int SLOT_SIZE = 1024;

	public static AtomicInteger OCCUPY_COUNT = new AtomicInteger(0);

	private static Slot[] slots = new Slot[SLOT_SIZE];

	public synchronized static int offerSlot(Class<? extends Slot> slotClazz){
		try{
			for(int i = 0; i < slots.length; i++){
				if(slots[i] == null){
					slots[i] = slotClazz.newInstance();
					OCCUPY_COUNT.incrementAndGet();
					return i;
				}
			}
		}catch(Exception e){
			LOG.error("offer slot error",e);
			return -1;
		}
		return -1;
	}

	@SuppressWarnings("unchecked")
	public static <T extends Slot> T getSlot(int slotIndex){
		return (T)slots[slotIndex];
	}

	public static void releaseSlot(int slotIndex){
		if(slots[slotIndex] != null){
			LOG.info("[{}]:slot[{}] released",slots[slotIndex].getRequestId(),slotIndex);
			slots[slotIndex] = null;
			OCCUPY_COUNT.decrementAndGet();
		}else{
			LOG.warn("slot[{}] already has been released",slotIndex);
		}
	}

	public static int getSlotSize() {
		return SLOT_SIZE;
	}

	public static void setSlotSize(int slotSize) {
		SLOT_SIZE = slotSize;
	}
}
