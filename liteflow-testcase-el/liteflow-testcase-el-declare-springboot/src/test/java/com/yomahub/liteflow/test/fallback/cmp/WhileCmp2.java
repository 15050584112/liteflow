package com.yomahub.liteflow.test.fallback.cmp;

import com.yomahub.liteflow.annotation.FallbackCmp;
import com.yomahub.liteflow.annotation.LiteflowCmpDefine;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.annotation.LiteflowMethod;
import com.yomahub.liteflow.core.NodeComponent;
import com.yomahub.liteflow.enums.LiteFlowMethodEnum;
import com.yomahub.liteflow.enums.NodeTypeEnum;

@LiteflowComponent("wn2")
@LiteflowCmpDefine(NodeTypeEnum.WHILE)
@FallbackCmp
public class WhileCmp2 {

    @LiteflowMethod(value = LiteFlowMethodEnum.PROCESS_WHILE)
    public boolean processWhile(NodeComponent bindCmp) throws Exception {
        return false;
    }
}
