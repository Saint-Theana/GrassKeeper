package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlantFlowerAcceptFlowerResultInfo.*;
import org.sorapointa.proto.PlantFlowerAcceptFlowerResultInfo;

public class PlantFlowerAcceptAllGiveFlowerRsp {
    @Tag(tag=10) public Integer scheduleId = null;
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public List<PlantFlowerAcceptFlowerResultInfo> acceptFlowerResultInfoList = new ArrayList<>();
}
