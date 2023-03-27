package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EvtAvatarUpdateFocusNotify {
    public enum EvtAvatarUpdateFocusNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=318) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=5) public Integer entityId = null;
    @Tag(tag=15) public Integer forwardType = null;
    @Tag(tag=3) public Vector focusForward = null;
}
