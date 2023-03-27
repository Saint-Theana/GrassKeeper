package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DraftOwnerTwiceConfirmNotify {
    public enum DraftOwnerTwiceConfirmNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5414) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Integer draftId = null;
    @Tag(tag=7) public Integer twiceConfirmDeadlineTime = null;
}
