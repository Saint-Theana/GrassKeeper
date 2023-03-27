package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DraftGuestReplyInviteNotify {
    public enum DraftGuestReplyInviteNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5470) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Integer guestUid = null;
    @Tag(tag=15) public Integer draftId = null;
    @Tag(tag=7) public Boolean isAgree = null;
}
