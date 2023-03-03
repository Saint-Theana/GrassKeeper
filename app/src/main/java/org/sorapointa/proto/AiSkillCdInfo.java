package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AiSkillCdInfo {
    public static class MapSkillCdMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public static class MapSkillGroupCdMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=11) public List<MapSkillCdMap> skillCdMap = new ArrayList<>();
    @Tag(tag=6) public List<MapSkillGroupCdMap> skillGroupCdMap = new ArrayList<>();
}
