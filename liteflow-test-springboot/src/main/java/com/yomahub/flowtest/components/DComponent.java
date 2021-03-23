/**
 * <p>Title: liteflow</p>
 * <p>Description: 轻量级的组件式流程框架</p>
 * @author Bryan.Zhang
 * @email weenyc31@163.com
 * @Date 2020/4/1
 */
package com.yomahub.flowtest.components;

import com.yomahub.liteflow.core.NodeComponent;
import com.yomahub.liteflow.entity.data.Slot;
import org.springframework.stereotype.Component;

@Component("d")
public class DComponent extends NodeComponent {

	@Override
	public void process() {
		System.out.println("Dcomponent executed!");

	}

}
