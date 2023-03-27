package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class H5ActivityIdsNotify {
    public static class MapH5ActivityMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum H5ActivityIdsNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5696) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public List<MapH5ActivityMap> h5ActivityMap = new ArrayList<>();
    @Tag(tag=1) public Integer clientRedDotTimestamp = null;
}
