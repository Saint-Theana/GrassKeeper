package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MpPlayGuestReplyInviteRsp {
    public enum MpPlayGuestReplyInviteRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1848) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Integer mpPlayId = null;
}
