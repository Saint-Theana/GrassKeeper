package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeScenePointFishFarmingInfo.*;
import org.sorapointa.proto.HomeScenePointFishFarmingInfo;

public class HomeScenePointFishFarmingInfoNotify {
    @Tag(tag=7) public List<HomeScenePointFishFarmingInfo> fishFarmingInfoList = new ArrayList<>();
}
