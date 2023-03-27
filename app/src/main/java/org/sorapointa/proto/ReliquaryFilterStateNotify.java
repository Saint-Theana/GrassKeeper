package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ReliquaryFilterStateNotify {
    public static class MapReliquaryFilterStateMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum OEOHONEIBDO {
        @Tag(tag=0) None ,
        @Tag(tag=631) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public List<MapReliquaryFilterStateMap> reliquaryFilterStateMap = new ArrayList<>();
}
