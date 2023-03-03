package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlantFlowerAcceptFlowerResultInfo.*;
import org.sorapointa.proto.PlantFlowerAcceptFlowerResultInfo;

public class PlantFlowerAcceptGiveFlowerRsp {
    @Tag(tag=1) public Integer scheduleId = null;
    @Tag(tag=15) public PlantFlowerAcceptFlowerResultInfo acceptFlowerResultInfo = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
