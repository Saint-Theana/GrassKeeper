package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EvtSetAttackTargetInfo.*;
import org.sorapointa.proto.EvtSetAttackTargetInfo;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;

public class EvtSetAttackTargetNotify {
    public enum EvtSetAttackTargetNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=314) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1) public EvtSetAttackTargetInfo evtSetAttackTargetInfo = null;
    @Tag(tag=15) public Integer forwardType = null;
}
