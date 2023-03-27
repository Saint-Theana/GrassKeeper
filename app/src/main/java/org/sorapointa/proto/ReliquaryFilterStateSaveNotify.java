package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ReliquaryFilterStateSaveNotify {
    public static class MapReliquaryFilterStateMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum LBCPMMCKAIH {
        @Tag(tag=0) None ,
        @Tag(tag=672) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=3) public List<MapReliquaryFilterStateMap> reliquaryFilterStateMap = new ArrayList<>();
}
