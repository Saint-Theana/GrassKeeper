package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeFishFarmingInfo.*;
import org.sorapointa.proto.HomeFishFarmingInfo;

public class HomeUpdateFishFarmingInfoReq {
    public enum HomeUpdateFishFarmingInfoReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4847) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=3) public HomeFishFarmingInfo fishFarmingInfo = null;
}
