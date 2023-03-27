package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EvtCostStaminaNotify {
    public enum EvtCostStaminaNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=362) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8,isFloat=true) public Float costStamina = null;
    @Tag(tag=14) public Integer skillId = null;
}
