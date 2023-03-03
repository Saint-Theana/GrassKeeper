package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlatformInfo.*;
import org.sorapointa.proto.PlatformInfo;

public class PlatformStartRouteNotify {
    @Tag(tag=15) public PlatformInfo platform = null;
    @Tag(tag=12) public Integer sceneTime = null;
    @Tag(tag=8) public Integer entityId = null;
}
