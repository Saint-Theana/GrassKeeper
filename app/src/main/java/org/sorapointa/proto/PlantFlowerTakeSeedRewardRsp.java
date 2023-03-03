package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlantFlowerTakeSeedRewardRsp {
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public Integer scheduleId = null;
}
