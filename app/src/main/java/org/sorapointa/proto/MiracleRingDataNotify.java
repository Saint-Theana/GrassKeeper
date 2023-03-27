package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MiracleRingDataNotify {
    public enum MiracleRingDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5246) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Boolean isGadgetCreated = null;
    @Tag(tag=8) public Integer miracleRingCd = null;
    @Tag(tag=4) public Integer lastDeliverItemTime = null;
    @Tag(tag=13) public Integer lastTakeRewardTime = null;
    @Tag(tag=6) public Integer gadgetEntityId = null;
}
