package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeCustomFurnitureInfo.*;
import org.sorapointa.proto.HomeCustomFurnitureInfo;

public class HomeCustomFurnitureInfoNotify {
    public static class MapUsedSubFurnitureCountMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum HomeCustomFurnitureInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4784) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public List<Integer> deleteCustomFurnitureList = new ArrayList<>();
    @Tag(tag=15) public List<HomeCustomFurnitureInfo> customFurnitureInfoList = new ArrayList<>();
    @Tag(tag=2) public List<MapUsedSubFurnitureCountMap> usedSubFurnitureCountMap = new ArrayList<>();
}
