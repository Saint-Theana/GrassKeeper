package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DraftGuestReplyTwiceConfirmRsp {
    public enum DraftGuestReplyTwiceConfirmRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5429) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public Boolean isAgree = null;
    @Tag(tag=15) public Integer draftId = null;
}
