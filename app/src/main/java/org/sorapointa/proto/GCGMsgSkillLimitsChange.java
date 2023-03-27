package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGMsgSkillLimitsChange {
    public static class MapCardLimitsChangeMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public GCGCardSkillLimitsInfo value = null;
    }

    @Tag(tag=13) public List<MapCardLimitsChangeMap> cardLimitsChangeMap = new ArrayList<>();
}
