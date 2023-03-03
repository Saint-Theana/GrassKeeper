package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SceneEntityInfo.*;
import org.sorapointa.proto.SceneEntityInfo;
import org.sorapointa.proto.VisionType.*;
import org.sorapointa.proto.VisionType;

public class ScenePlayerBackgroundAvatarRefreshNotify {
    @Tag(tag=4) public List<SceneEntityInfo> entityList = new ArrayList<>();
    @Tag(tag=8) public Integer appearType = null;
    @Tag(tag=9) public Integer param = null;
}
