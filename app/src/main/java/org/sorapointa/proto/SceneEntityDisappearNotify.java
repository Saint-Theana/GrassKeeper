package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.VisionType.*;
import org.sorapointa.proto.VisionType;

public class SceneEntityDisappearNotify {
    @Tag(tag=6) public Integer param = null;
    @Tag(tag=1) public List<Integer> entityList = new ArrayList<>();
    @Tag(tag=2) public Integer disappearType = null;
}
