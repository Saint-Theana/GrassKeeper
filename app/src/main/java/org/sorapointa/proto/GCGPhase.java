package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGPhaseType.*;
import org.sorapointa.proto.GCGPhaseType;

public class GCGPhase {
    public static class MapAllowControllerMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=5) public Integer phaseType = null;
    @Tag(tag=6) public List<MapAllowControllerMap> allowControllerMap = new ArrayList<>();
}
