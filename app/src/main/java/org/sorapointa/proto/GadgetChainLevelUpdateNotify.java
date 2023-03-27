package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GadgetChainLevelUpdateNotify {
    public static class MapGadgetChainLevelMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum GadgetChainLevelUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=900) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public List<MapGadgetChainLevelMap> gadgetChainLevelMap = new ArrayList<>();
}
