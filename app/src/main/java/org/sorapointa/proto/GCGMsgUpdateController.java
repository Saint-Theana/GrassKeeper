package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGMsgUpdateController {
    public static class MapAllowControllerMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=7) public List<MapAllowControllerMap> allowControllerMap = new ArrayList<>();
}
