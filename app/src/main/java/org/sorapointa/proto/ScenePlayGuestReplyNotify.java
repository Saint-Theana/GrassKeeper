package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScenePlayGuestReplyNotify {
    public enum ScenePlayGuestReplyNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4412) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Integer guestUid = null;
    @Tag(tag=12) public Integer playId = null;
    @Tag(tag=10) public Boolean isAgree = null;
}
