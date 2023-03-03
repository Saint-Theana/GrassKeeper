package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGPhaseType.*;
import org.sorapointa.proto.GCGPhaseType;

public class GCGMsgPhaseChange {
    public static class MapAllowControllerMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=15) public List<MapAllowControllerMap> allowControllerMap = new ArrayList<>();
    @Tag(tag=12) public Integer beforePhase = null;
    @Tag(tag=5) public Integer afterPhase = null;
}
