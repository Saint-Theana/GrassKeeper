package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ItemCdGroupTimeNotify {
    public static class MapItemCdMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Long value = null;
    }

    public enum ItemCdGroupTimeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=651) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public List<MapItemCdMap> itemCdMap = new ArrayList<>();
}
