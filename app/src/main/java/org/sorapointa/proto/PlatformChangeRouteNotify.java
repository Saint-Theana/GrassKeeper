package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlatformInfo.*;
import org.sorapointa.proto.PlatformInfo;

public class PlatformChangeRouteNotify {
    @Tag(tag=2) public Integer entityId = null;
    @Tag(tag=1) public PlatformInfo platform = null;
    @Tag(tag=8) public Integer sceneTime = null;
}
