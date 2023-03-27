package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum FishBattleEndRsp_FishNoRewardReason {
        @Tag(tag=0) FishNoRewardNone ,
        @Tag(tag=1) FishNoRewardActivityLimit ,
        @Tag(tag=2) FishNoRewardBagLimit ,
        @Tag(tag=3) FishNoRewardPoolLimit ;
}
