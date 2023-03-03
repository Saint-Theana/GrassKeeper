package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FishtankFishInfo.*;
import org.sorapointa.proto.FishtankFishInfo;
import org.sorapointa.proto.MonsterBornType.*;
import org.sorapointa.proto.MonsterBornType;
import org.sorapointa.proto.MonsterRoute.*;
import org.sorapointa.proto.MonsterRoute;
import org.sorapointa.proto.SceneFishInfo.*;
import org.sorapointa.proto.SceneFishInfo;
import org.sorapointa.proto.SceneWeaponInfo.*;
import org.sorapointa.proto.SceneWeaponInfo;

public class SceneMonsterInfo {
    public static class MapSummonTagMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=1) public Integer monsterId = null;
    @Tag(tag=2) public Integer groupId = null;
    @Tag(tag=3) public Integer configId = null;
    @Tag(tag=4) public List<SceneWeaponInfo> weaponList = new ArrayList<>();
    @Tag(tag=5) public Integer authorityPeerId = null;
    @Tag(tag=6) public List<Integer> affixList = new ArrayList<>();
    @Tag(tag=7) public Boolean isElite = null;
    @Tag(tag=8) public Integer ownerEntityId = null;
    @Tag(tag=9) public Integer summonedTag = null;
    @Tag(tag=10) public List<MapSummonTagMap> summonTagMap = new ArrayList<>();
    @Tag(tag=11) public Integer poseId = null;
    @Tag(tag=12) public Integer bornType = null;
    @Tag(tag=13) public Integer blockId = null;
    @Tag(tag=14) public Integer markFlag = null;
    @Tag(tag=15) public Integer titleId = null;
    @Tag(tag=16) public Integer specialNameId = null;
    @Tag(tag=17) public Integer attackTargetId = null;
    @Tag(tag=18) public MonsterRoute monsterRoute = null;
    @Tag(tag=19) public Integer aiConfigId = null;
    @Tag(tag=20) public Integer levelRouteId = null;
    @Tag(tag=21) public Integer initPoseId = null;
    @Tag(tag=22) public Boolean isLight = null;
    @Tag(tag=23) public Integer killNum = null;
    @Tag(tag=50) public SceneFishInfo fishInfo = null;
    @Tag(tag=51) public FishtankFishInfo fishtankFishInfo = null;
}
