package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlatformInfo.*;
import org.sorapointa.proto.PlatformInfo;

public class PlatformStopRouteNotify {
    @Tag(tag=9) public Integer sceneTime = null;
    @Tag(tag=12) public Integer entityId = null;
    @Tag(tag=8) public PlatformInfo platform = null;
}
