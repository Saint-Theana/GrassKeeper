package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SalvagePreventSettleNotify {
    public enum SalvagePreventSettleNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8036) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public Integer galleryId = null;
    @Tag(tag=6) public SalvagePreventSettleInfo settleInfo = null;
}
