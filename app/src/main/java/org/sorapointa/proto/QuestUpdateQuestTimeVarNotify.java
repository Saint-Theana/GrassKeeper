package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QuestUpdateQuestTimeVarNotify {
    public static class MapTimeVarMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum QuestUpdateQuestTimeVarNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=436) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public Integer parentQuestId = null;
    @Tag(tag=8) public List<MapTimeVarMap> timeVarMap = new ArrayList<>();
}
