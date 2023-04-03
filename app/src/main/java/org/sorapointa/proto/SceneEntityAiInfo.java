package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;
import org.sorapointa.proto.ServantInfo.*;
import org.sorapointa.proto.ServantInfo;

public class SceneEntityAiInfo {
    public static class MapSkillCdMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public static class MapAiThreatMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public static class MapSkillGroupCdMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=1) public Boolean isAiOpen = null;
    @Tag(tag=2) public Vector bornPos = null;
    @Tag(tag=3) public List<MapSkillCdMap> skillCdMap = new ArrayList<>();
    @Tag(tag=4) public ServantInfo servantInfo = null;
    @Tag(tag=5) public List<MapAiThreatMap> aiThreatMap = new ArrayList<>();
    @Tag(tag=6) public List<MapSkillGroupCdMap> skillGroupCdMap = new ArrayList<>();
    @Tag(tag=7) public Integer curTactic = null;
}
