package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeAvatarTalkRsp {
    public enum HomeAvatarTalkRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4704) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public HomeAvatarTalkFinishInfo avatarTalkInfo = null;
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
}
