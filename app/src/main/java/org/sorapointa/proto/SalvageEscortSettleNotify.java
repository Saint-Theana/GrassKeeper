package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SalvageEscortSettleInfo.*;
import org.sorapointa.proto.SalvageEscortSettleInfo;

public class SalvageEscortSettleNotify {
    public enum SalvageEscortSettleNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8967) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public Integer galleryId = null;
    @Tag(tag=2) public SalvageEscortSettleInfo settleInfo = null;
}
