package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EvtRushMoveInfo.*;
import org.sorapointa.proto.EvtRushMoveInfo;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;

public class EvtRushMoveNotify {
    public enum EvtRushMoveNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=329) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=13) public EvtRushMoveInfo evtRushMoveInfo = null;
    @Tag(tag=1) public Integer forwardType = null;
}
