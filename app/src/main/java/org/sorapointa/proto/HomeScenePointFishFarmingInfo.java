package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeScenePointFishFarmingInfo {
    @Tag(tag=11) public List<Integer> fishIdList = new ArrayList<>();
    @Tag(tag=6) public Integer sceneId = null;
    @Tag(tag=5) public Integer localEntityId = null;
}
