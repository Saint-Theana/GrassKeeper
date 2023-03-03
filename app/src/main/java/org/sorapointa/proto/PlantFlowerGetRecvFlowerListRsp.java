package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlantFlowerRecvFlowerData.*;
import org.sorapointa.proto.PlantFlowerRecvFlowerData;

public class PlantFlowerGetRecvFlowerListRsp {
    @Tag(tag=6) public Integer scheduleId = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public List<PlantFlowerRecvFlowerData> recvFlowerList = new ArrayList<>();
}
