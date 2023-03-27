package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FishBattleEndReq {
    public enum FishBattleEndReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5837) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=11) public Integer battleResult = null;
    @Tag(tag=10) public Integer maxBonusTime = null;
    @Tag(tag=5) public Boolean isAlwaysBonus = null;
}
