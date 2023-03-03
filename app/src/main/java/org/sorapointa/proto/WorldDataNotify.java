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

    public enum DataType {
        @Tag(tag=0) DATA_TYPE_NONE ,
        @Tag(tag=1) DATA_TYPE_WORLD_LEVEL ,
        @Tag(tag=2) DATA_TYPE_IS_IN_MP_MODE ;
    }

    @Tag(tag=9) public List<MapWorldPropMap> worldPropMap = new ArrayList<>();
}
