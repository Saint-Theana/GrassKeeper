package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PropValue.*;
import org.sorapointa.proto.PropValue;

public class EntityPropNotify {
    public static class MapPropMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public PropValue value = null;
    }

    @Tag(tag=1) public List<MapPropMap> propMap = new ArrayList<>();
    @Tag(tag=14) public Integer entityId = null;
}
