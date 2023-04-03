package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PropValue.*;
import org.sorapointa.proto.PropValue;

public class WorldDataNotify {
    public static class MapWorldPropMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public PropValue value = null;
    }

    public enum WorldDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3244) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=3) public List<MapWorldPropMap> worldPropMap = new ArrayList<>();
}
