package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EvtBeingHitNotify {
    public enum EvtBeingHitNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=305) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=4) public Integer forwardType = null;
    @Tag(tag=15) public EvtBeingHitInfo beingHitInfo = null;
}
