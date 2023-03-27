package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EvtAvatarExitFocusNotify {
    public enum EvtAvatarExitFocusNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=358) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=7) public Vector finishForward = null;
    @Tag(tag=13) public Integer entityId = null;
    @Tag(tag=14) public Integer forwardType = null;
}
