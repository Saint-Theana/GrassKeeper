package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeFishFarmingInfo.*;
import org.sorapointa.proto.HomeFishFarmingInfo;

public class HomeGetFishFarmingInfoRsp {
    @Tag(tag=7) public List<HomeFishFarmingInfo> fishFarmingInfoList = new ArrayList<>();
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
}
