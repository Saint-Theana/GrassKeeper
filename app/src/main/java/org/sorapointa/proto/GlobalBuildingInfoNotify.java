package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BuildingInfo.*;
import org.sorapointa.proto.BuildingInfo;

public class GlobalBuildingInfoNotify {
    @Tag(tag=5) public Integer currentNum = null;
    @Tag(tag=3) public List<BuildingInfo> buildingList = new ArrayList<>();
    @Tag(tag=13) public Integer maxNum = null;
}
