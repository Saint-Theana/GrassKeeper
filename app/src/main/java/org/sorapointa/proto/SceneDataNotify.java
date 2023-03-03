package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneDataNotify {
    @Tag(tag=15) public List<String> levelConfigNameList = new ArrayList<>();
    @Tag(tag=8) public List<Integer> sceneTagIdList = new ArrayList<>();
}
