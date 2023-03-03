package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QuestUpdateQuestTimeVarNotify {
    public static class MapTimeVarMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=1) public List<MapTimeVarMap> timeVarMap = new ArrayList<>();
    @Tag(tag=3) public Integer parentQuestId = null;
}
