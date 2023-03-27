package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlantFlowerSetFlowerWishReq {
    public static class MapFlowerNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum PlantFlowerSetFlowerWishReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8573) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public List<MapFlowerNumMap> flowerNumMap = new ArrayList<>();
    @Tag(tag=4) public Integer scheduleId = null;
}
