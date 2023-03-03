package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeFishFarmingInfo.*;
import org.sorapointa.proto.HomeFishFarmingInfo;

public class HomeUpdateFishFarmingInfoReq {
    @Tag(tag=5) public HomeFishFarmingInfo fishFarmingInfo = null;
}
