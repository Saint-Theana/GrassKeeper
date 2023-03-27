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

    public enum AvatarSkillDepotChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1098) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public List<Integer> talentIdList = new ArrayList<>();
    @Tag(tag=11) public List<Integer> proudSkillList = new ArrayList<>();
    @Tag(tag=8) public Integer skillDepotId = null;
    @Tag(tag=3) public Integer entityId = null;
    @Tag(tag=4) public List<MapProudSkillExtraLevelMap> proudSkillExtraLevelMap = new ArrayList<>();
    @Tag(tag=10) public Integer coreProudSkillLevel = null;
    @Tag(tag=13) public List<MapSkillLevelMap> skillLevelMap = new ArrayList<>();
    @Tag(tag=12) public Long avatarGuid = null;
}
