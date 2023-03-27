package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class Avatar {
    public static class MapSkillLevelMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public static class MapProudSkillExtraLevelMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=1) public Integer uid = null;
    @Tag(tag=2) public Integer avatarId = null;
    @Tag(tag=3) public Long guid = null;
    @Tag(tag=4) public Integer peerId = null;
    @Tag(tag=5) public List<Integer> equipIdList = new ArrayList<>();
    @Tag(tag=6) public Integer skillDepotId = null;
    @Tag(tag=7) public List<Integer> talentIdList = new ArrayList<>();
    @Tag(tag=8) public SceneWeaponInfo weapon = null;
    @Tag(tag=9) public List<SceneReliquaryInfo> reliquaryList = new ArrayList<>();
    @Tag(tag=11) public Integer coreProudSkillLevel = null;
    @Tag(tag=12) public List<Integer> inherentProudSkillList = new ArrayList<>();
    @Tag(tag=13) public List<MapSkillLevelMap> skillLevelMap = new ArrayList<>();
    @Tag(tag=14) public List<MapProudSkillExtraLevelMap> proudSkillExtraLevelMap = new ArrayList<>();
    @Tag(tag=15) public List<ServerBuff> serverBuffList = new ArrayList<>();
    @Tag(tag=16) public List<Integer> teamResonanceList = new ArrayList<>();
    @Tag(tag=17) public Integer wearingFlycloakId = null;
    @Tag(tag=18) public Integer bornTime = null;
    @Tag(tag=19) public Integer costumeId = null;
    @Tag(tag=20) public CurVehicleInfo curVehicleInfo = null;
    @Tag(tag=21) public AvatarExcelInfo excelInfo = null;
    @Tag(tag=22) public Integer animHash = null;
}
