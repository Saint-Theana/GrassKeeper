package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlantFlowerGetCanGiveFriendFlowerRsp {
    public static class MapFlowerNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum PlantFlowerGetCanGiveFriendFlowerRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8699) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Integer scheduleId = null;
    @Tag(tag=10) public List<MapFlowerNumMap> flowerNumMap = new ArrayList<>();
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
}
