package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlantFlowerRecvFlowerData.*;
import org.sorapointa.proto.PlantFlowerRecvFlowerData;

public class PlantFlowerGetRecvFlowerListRsp {
    public enum PlantFlowerGetRecvFlowerListRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8952) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public List<PlantFlowerRecvFlowerData> recvFlowerList = new ArrayList<>();
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public Integer scheduleId = null;
}
