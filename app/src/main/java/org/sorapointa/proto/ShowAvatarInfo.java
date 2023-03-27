package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ShowAvatarInfo {
    public static class MapPropMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public PropValue value = null;
    }

    public static class MapFightPropMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2,isFloat=true) public Float value = null;
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
    @Tag(tag=2) public List<MapPropMap> propMap = new ArrayList<>();
    @Tag(tag=3) public List<Integer> talentIdList = new ArrayList<>();
    @Tag(tag=4) public List<MapFightPropMap> fightPropMap = new ArrayList<>();
    @Tag(tag=5) public Integer skillDepotId = null;
    @Tag(tag=6) public Integer coreProudSkillLevel = null;
    @Tag(tag=7) public List<Integer> inherentProudSkillList = new ArrayList<>();
    @Tag(tag=8) public List<MapSkillLevelMap> skillLevelMap = new ArrayList<>();
    @Tag(tag=9) public List<MapProudSkillExtraLevelMap> proudSkillExtraLevelMap = new ArrayList<>();
    @Tag(tag=10) public List<ShowEquip> equipList = new ArrayList<>();
    @Tag(tag=11) public AvatarFetterInfo fetterInfo = null;
    @Tag(tag=12) public Integer costumeId = null;
    @Tag(tag=13) public AvatarExcelInfo excelInfo = null;
}
