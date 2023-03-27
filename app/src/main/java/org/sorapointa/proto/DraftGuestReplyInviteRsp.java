package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DraftGuestReplyInviteRsp {
    public enum DraftGuestReplyInviteRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5480) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Integer draftId = null;
    @Tag(tag=7) public Boolean isAgree = null;
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
}
