package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlantFlowerGetSeedInfoRsp {
    public enum PlantFlowerGetSeedInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8249) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public Integer seedRewardId = null;
    @Tag(tag=8) public Integer scheduleId = null;
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
}
