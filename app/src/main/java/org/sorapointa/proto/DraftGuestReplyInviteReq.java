package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DraftGuestReplyInviteReq {
    public enum DraftGuestReplyInviteReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5474) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=13) public Boolean isAgree = null;
    @Tag(tag=10) public Integer draftId = null;
}
