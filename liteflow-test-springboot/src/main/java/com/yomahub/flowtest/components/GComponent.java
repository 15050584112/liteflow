/**
 * <p>Title: liteflow</p>
 * <p>Description: 轻量级的组件式流程框架</p>
 * @author Bryan.Zhang
 * @email weenyc31@163.com
 * @Date 2020/4/1
 */
package com.yomahub.flowtest.components;

import com.yomahub.liteflow.core.NodeComponent;
import org.springframework.stereotype.Component;

@Component("g")
public class GComponent extends NodeComponent {

	@Override
	public void process() {
		try{
			Thread.sleep(6000);
		}catch (Exception e){

		}
		System.out.println("Gcomponent executed!");
		this.getSlot().setResponseData("i am a response");
	}

}
