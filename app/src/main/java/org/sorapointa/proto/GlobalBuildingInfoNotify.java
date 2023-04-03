package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BuildingInfo.*;
import org.sorapointa.proto.BuildingInfo;

public class GlobalBuildingInfoNotify {
    public enum GlobalBuildingInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5389) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Integer maxNum = null;
    @Tag(tag=8) public Integer currentNum = null;
    @Tag(tag=3) public List<BuildingInfo> buildingList = new ArrayList<>();
}
