package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeFishFarmingInfo.*;
import org.sorapointa.proto.HomeFishFarmingInfo;

public class HomeGetFishFarmingInfoRsp {
    public enum HomeGetFishFarmingInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4899) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=1) public List<HomeFishFarmingInfo> fishFarmingInfoList = new ArrayList<>();
}
