package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SceneEntityInfo.*;
import org.sorapointa.proto.SceneEntityInfo;
import org.sorapointa.proto.VisionType.*;
import org.sorapointa.proto.VisionType;

public class SceneEntityAppearNotify {
    @Tag(tag=15) public Integer appearType = null;
    @Tag(tag=9) public Integer param = null;
    @Tag(tag=5) public List<SceneEntityInfo> entityList = new ArrayList<>();
}
