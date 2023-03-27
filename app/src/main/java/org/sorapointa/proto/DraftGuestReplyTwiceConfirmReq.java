package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DraftGuestReplyTwiceConfirmReq {
    public enum DraftGuestReplyTwiceConfirmReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5424) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public Boolean isAgree = null;
    @Tag(tag=11) public Integer draftId = null;
}
