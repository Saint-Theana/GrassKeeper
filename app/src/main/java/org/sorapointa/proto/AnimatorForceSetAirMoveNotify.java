package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;

public class AnimatorForceSetAirMoveNotify {
    public enum AnimatorForceSetAirMoveNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=330) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1) public Boolean inAirMove = null;
    @Tag(tag=11) public Integer forwardType = null;
    @Tag(tag=2) public Integer entityId = null;
}
