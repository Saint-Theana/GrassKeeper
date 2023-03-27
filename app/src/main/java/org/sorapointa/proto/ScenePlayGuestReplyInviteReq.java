package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScenePlayGuestReplyInviteReq {
    public enum ScenePlayGuestReplyInviteReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4430) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=9) public Integer playId = null;
    @Tag(tag=1) public Boolean isAgree = null;
}
