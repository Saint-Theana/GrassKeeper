package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EntityRendererChangedInfo {
    public static class MapChangedRenderers {
        @Tag(tag=1) public String key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=1) public List<MapChangedRenderers> changedRenderers = new ArrayList<>();
    @Tag(tag=2) public Integer visibilityCount = null;
    @Tag(tag=3) public Boolean isCached = null;
}
