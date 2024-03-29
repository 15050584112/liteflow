/**
 * <p>Title: liteflow</p>
 * <p>Description: 轻量级的组件式流程框架</p>
 * @author Bryan.Zhang
 * @email weenyc31@163.com
 * @Date 2020/4/1
 */
package com.yomahub.liteflow.test.booleanOpt.cmp;

import com.yomahub.liteflow.core.NodeWhileComponent;
import org.springframework.stereotype.Component;

@Component("w2")
public class W2 extends NodeWhileComponent {

	@Override
	public boolean processWhile() throws Exception {
		return false;
	}
}
