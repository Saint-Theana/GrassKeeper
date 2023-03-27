package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonChallengeFinishNotify {
    public static class MapStrengthenPointDataMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public StrengthenPointData value = null;
    }

    public enum DungeonChallengeFinishNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=946) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer challengeIndex = null;
    @Tag(tag=13) public Integer finishType = null;
    @Tag(tag=6) public Boolean isSuccess = null;
    @Tag(tag=5) public Integer challengeRecordType = null;
    @Tag(tag=3) public Boolean isNewRecord = null;
    @Tag(tag=9) public Integer currentValue = null;
    @Tag(tag=11) public Integer timeCost = null;
    @Tag(tag=7) public List<MapStrengthenPointDataMap> strengthenPointDataMap = new ArrayList<>();
    @Tag(tag=1867) public ChannellerSlabLoopDungeonResultInfo channellerSlabLoopDungeonResultInfo = null;
    @Tag(tag=942) public EffigyChallengeDungeonResultInfo effigyChallengeDungeonResultInfo = null;
    @Tag(tag=709) public PotionDungeonResultInfo potionDungeonResultInfo = null;
    @Tag(tag=41) public CustomDungeonResultInfo customDungeonResultInfo = null;
}
