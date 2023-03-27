package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EvtAiSyncSkillCdNotify {
    public static class MapAiCdMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public AiSkillCdInfo value = null;
    }

    public enum EvtAiSyncSkillCdNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=343) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=11) public List<MapAiCdMap> aiCdMap = new ArrayList<>();
}
