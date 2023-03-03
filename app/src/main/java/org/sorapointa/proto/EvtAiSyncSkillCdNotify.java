package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AiSkillCdInfo.*;
import org.sorapointa.proto.AiSkillCdInfo;

public class EvtAiSyncSkillCdNotify {
    public static class MapAiCdMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public AiSkillCdInfo value = null;
    }

    @Tag(tag=7) public List<MapAiCdMap> aiCdMap = new ArrayList<>();
}
