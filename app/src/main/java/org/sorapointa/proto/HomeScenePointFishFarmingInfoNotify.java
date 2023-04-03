package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeScenePointFishFarmingInfo.*;
import org.sorapointa.proto.HomeScenePointFishFarmingInfo;

public class HomeScenePointFishFarmingInfoNotify {
    public enum JNJIJCHNAMH {
        @Tag(tag=0) None ,
        @Tag(tag=4895) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public List<HomeScenePointFishFarmingInfo> fishFarmingInfoList = new ArrayList<>();
}
