package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlantFlowerTakeSeedRewardRsp {
    public enum PlantFlowerTakeSeedRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8727) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Integer scheduleId = null;
}
