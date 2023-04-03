package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.LuminanceStoneChallengeSettleInfo.*;
import org.sorapointa.proto.LuminanceStoneChallengeSettleInfo;

public class LuminanceStoneChallengeSettleNotify {
    public enum LuminanceStoneChallengeSettleNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8545) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public LuminanceStoneChallengeSettleInfo settleInfo = null;
    @Tag(tag=14) public Integer galleryId = null;
}
