package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AiThreatInfo.*;
import org.sorapointa.proto.AiThreatInfo;

public class EvtAiSyncCombatThreatInfoNotify {
    public static class MapCombatThreatInfoMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public AiThreatInfo value = null;
    }

    public enum EvtAiSyncCombatThreatInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=356) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public List<MapCombatThreatInfoMap> combatThreatInfoMap = new ArrayList<>();
}
