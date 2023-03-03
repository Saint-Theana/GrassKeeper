package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneAreaUnlockNotify {
    @Tag(tag=10) public List<Integer> areaList = new ArrayList<>();
    @Tag(tag=9) public Integer sceneId = null;
}
