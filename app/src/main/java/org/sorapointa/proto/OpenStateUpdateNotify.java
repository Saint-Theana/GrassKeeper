package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class OpenStateUpdateNotify {
    public static class MapOpenStateMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum OpenStateUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=158) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public List<MapOpenStateMap> openStateMap = new ArrayList<>();
}
