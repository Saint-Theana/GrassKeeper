package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EntityFightPropUpdateNotify {
    public static class MapFightPropMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2,isFloat=true) public Float value = null;
    }

    public enum EntityFightPropUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1298) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public List<MapFightPropMap> fightPropMap = new ArrayList<>();
    @Tag(tag=7) public Integer entityId = null;
}
