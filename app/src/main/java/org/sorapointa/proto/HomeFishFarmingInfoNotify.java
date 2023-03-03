package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeFishFarmingInfo.*;
import org.sorapointa.proto.HomeFishFarmingInfo;

public class HomeFishFarmingInfoNotify {
    @Tag(tag=15) public List<HomeFishFarmingInfo> fishFarmingInfoList = new ArrayList<>();
}
