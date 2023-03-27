package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DraftTwiceConfirmResultNotify {
    public enum DraftTwiceConfirmResultNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5478) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Boolean isAllArgee = null;
    @Tag(tag=7) public Integer draftId = null;
}
