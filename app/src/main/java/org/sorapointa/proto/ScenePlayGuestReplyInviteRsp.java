package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScenePlayGuestReplyInviteRsp {
    public enum ScenePlayGuestReplyInviteRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4420) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public Boolean isAgree = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public Integer playId = null;
}
