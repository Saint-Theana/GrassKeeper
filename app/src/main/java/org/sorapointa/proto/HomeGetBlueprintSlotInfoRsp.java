package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeBlueprintSlotInfo.*;
import org.sorapointa.proto.HomeBlueprintSlotInfo;

public class HomeGetBlueprintSlotInfoRsp {
    @Tag(tag=6) public List<Integer> deleteSlotIdList = new ArrayList<>();
    @Tag(tag=3) public List<HomeBlueprintSlotInfo> slotInfoList = new ArrayList<>();
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
}
