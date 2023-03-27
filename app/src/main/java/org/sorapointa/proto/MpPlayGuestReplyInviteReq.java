package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MpPlayGuestReplyInviteReq {
    public enum MpPlayGuestReplyInviteReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1806) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=6) public Integer mpPlayId = null;
    @Tag(tag=7) public Boolean isAgree = null;
}
