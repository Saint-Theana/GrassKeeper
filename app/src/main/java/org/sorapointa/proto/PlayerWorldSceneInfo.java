package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerWorldSceneInfo {
    @Tag(tag=11) public Integer sceneId = null;
    @Tag(tag=8) public List<Integer> sceneTagIdList = new ArrayList<>();
    @Tag(tag=12) public Boolean isLocked = null;
}
