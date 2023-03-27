package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarInfo {
    public static class MapPropMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public PropValue value = null;
    }

    public static class MapFightPropMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2,isFloat=true) public Float value = null;
    }

    public static class MapSkillMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public AvatarSkillInfo value = null;
    }

    public static class MapSkillLevelMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public static class MapProudSkillExtraLevelMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=1) public Integer avatarId = null;
    @Tag(tag=2) public Long guid = null;
    @Tag(tag=3) public List<MapPropMap> propMap = new ArrayList<>();
    @Tag(tag=4) public Integer lifeState = null;
    @Tag(tag=5) public List<Long> equipGuidList = new ArrayList<>();
    @Tag(tag=6) public List<Integer> talentIdList = new ArrayList<>();
    @Tag(tag=7) public List<MapFightPropMap> fightPropMap = new ArrayList<>();
    @Tag(tag=9) public TrialAvatarInfo trialAvatarInfo = null;
    @Tag(tag=10) public List<MapSkillMap> skillMap = new ArrayList<>();
    @Tag(tag=11) public Integer skillDepotId = null;
    @Tag(tag=12) public AvatarFetterInfo fetterInfo = null;
    @Tag(tag=13) public Integer coreProudSkillLevel = null;
    @Tag(tag=14) public List<Integer> inherentProudSkillList = new ArrayList<>();
    @Tag(tag=15) public List<MapSkillLevelMap> skillLevelMap = new ArrayList<>();
    @Tag(tag=16) public Integer expeditionState = null;
    @Tag(tag=17) public List<MapProudSkillExtraLevelMap> proudSkillExtraLevelMap = new ArrayList<>();
    @Tag(tag=18) public Boolean isFocus = null;
    @Tag(tag=19) public Integer avatarType = null;
    @Tag(tag=20) public List<Integer> teamResonanceList = new ArrayList<>();
    @Tag(tag=21) public Integer wearingFlycloakId = null;
    @Tag(tag=22) public List<AvatarEquipAffixInfo> equipAffixList = new ArrayList<>();
    @Tag(tag=23) public Integer bornTime = null;
    @Tag(tag=24) public List<Integer> pendingPromoteRewardList = new ArrayList<>();
    @Tag(tag=25) public Integer costumeId = null;
    @Tag(tag=26) public AvatarExcelInfo excelInfo = null;
    @Tag(tag=27) public Integer animHash = null;
    @Tag(tag=28) public PIDFKDHMHKA lejhmjbbjcp = null;
}
