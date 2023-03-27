package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DraftGuestReplyTwiceConfirmNotify {
    public enum DraftGuestReplyTwiceConfirmNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5416) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public Boolean isAgree = null;
    @Tag(tag=6) public Integer draftId = null;
    @Tag(tag=11) public Integer guestUid = null;
}
