package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlantFlowerGiveFriendFlowerReq {
    public static class MapFlowerNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum PlantFlowerGiveFriendFlowerReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8176) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1) public Integer uid = null;
    @Tag(tag=14) public List<MapFlowerNumMap> flowerNumMap = new ArrayList<>();
    @Tag(tag=5) public Integer scheduleId = null;
}
