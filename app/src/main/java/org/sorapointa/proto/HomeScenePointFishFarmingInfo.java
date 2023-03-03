package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeScenePointFishFarmingInfo {
    @Tag(tag=13) public Integer sceneId = null;
    @Tag(tag=1) public List<Integer> fishIdList = new ArrayList<>();
    @Tag(tag=3) public Integer localEntityId = null;
}
