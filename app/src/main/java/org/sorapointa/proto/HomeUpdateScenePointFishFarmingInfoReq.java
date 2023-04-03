package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeScenePointFishFarmingInfo.*;
import org.sorapointa.proto.HomeScenePointFishFarmingInfo;

public class HomeUpdateScenePointFishFarmingInfoReq {
    public enum GPAELILCNFJ {
        @Tag(tag=0) None ,
        @Tag(tag=4587) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public HomeScenePointFishFarmingInfo fishFarmingInfo = null;
}
