package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarSkillDepotChangeNotify {
    public static class MapProudSkillExtraLevelMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public static class MapSkillLevelMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=15) public Integer skillDepotId = null;
    @Tag(tag=14) public List<MapProudSkillExtraLevelMap> proudSkillExtraLevelMap = new ArrayList<>();
    @Tag(tag=9) public List<Integer> talentIdList = new ArrayList<>();
    @Tag(tag=4) public List<Integer> proudSkillList = new ArrayList<>();
    @Tag(tag=2) public Integer coreProudSkillLevel = null;
    @Tag(tag=7) public Integer entityId = null;
    @Tag(tag=12) public Long avatarGuid = null;
    @Tag(tag=3) public List<MapSkillLevelMap> skillLevelMap = new ArrayList<>();
}
