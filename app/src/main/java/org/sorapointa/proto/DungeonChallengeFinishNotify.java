package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChallengeFinishType.*;
import org.sorapointa.proto.ChallengeFinishType;
import org.sorapointa.proto.ChannelerSlabLoopDungeonResultInfo.*;
import org.sorapointa.proto.ChannelerSlabLoopDungeonResultInfo;
import org.sorapointa.proto.CustomDungeonResultInfo.*;
import org.sorapointa.proto.CustomDungeonResultInfo;
import org.sorapointa.proto.EffigyChallengeDungeonResultInfo.*;
import org.sorapointa.proto.EffigyChallengeDungeonResultInfo;
import org.sorapointa.proto.PotionDungeonResultInfo.*;
import org.sorapointa.proto.PotionDungeonResultInfo;
import org.sorapointa.proto.StrengthenPointData.*;
import org.sorapointa.proto.StrengthenPointData;

public class DungeonChallengeFinishNotify {
    public static class MapStrengthenPointDataMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public StrengthenPointData value = null;
    }

    @Tag(tag=13) public List<MapStrengthenPointDataMap> strengthenPointDataMap = new ArrayList<>();
    @Tag(tag=9) public Integer finishType = null;
    @Tag(tag=10) public Boolean isNewRecord = null;
    @Tag(tag=7) public Integer challengeRecordType = null;
    @Tag(tag=4) public Integer timeCost = null;
    @Tag(tag=15) public Integer currentValue = null;
    @Tag(tag=3) public Boolean isSuccess = null;
    @Tag(tag=5) public Integer challengeIndex = null;
    @Tag(tag=1521) public ChannelerSlabLoopDungeonResultInfo channelerSlabLoopDungeonResultInfo = null;
    @Tag(tag=1627) public EffigyChallengeDungeonResultInfo effigyChallengeDungeonResultInfo = null;
    @Tag(tag=1824) public PotionDungeonResultInfo potionDungeonResultInfo = null;
    @Tag(tag=1664) public CustomDungeonResultInfo customDungeonResultInfo = null;
}
