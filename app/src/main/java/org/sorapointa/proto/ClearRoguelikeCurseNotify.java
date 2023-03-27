package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ClearRoguelikeCurseNotify {
    public static class MapClearCurseMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum ClearRoguelikeCurseNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8183) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Boolean isCurseAllClear = null;
    @Tag(tag=9) public Boolean isClearAll = null;
    @Tag(tag=12) public List<MapClearCurseMap> clearCurseMap = new ArrayList<>();
    @Tag(tag=6) public Integer cardId = null;
}
