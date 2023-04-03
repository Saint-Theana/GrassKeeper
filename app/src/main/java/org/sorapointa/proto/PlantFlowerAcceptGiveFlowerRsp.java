package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlantFlowerAcceptFlowerResultInfo.*;
import org.sorapointa.proto.PlantFlowerAcceptFlowerResultInfo;

public class PlantFlowerAcceptGiveFlowerRsp {
    public enum PlantFlowerAcceptGiveFlowerRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8039) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Integer scheduleId = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public PlantFlowerAcceptFlowerResultInfo acceptFlowerResultInfo = null;
}
