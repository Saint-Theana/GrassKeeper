package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityGiveFriendGiftReq {
    public static class MapGiftNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum ActivityGiveFriendGiftReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8919) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=15) public Integer uid = null;
    @Tag(tag=9) public List<MapGiftNumMap> giftNumMap = new ArrayList<>();
    @Tag(tag=13) public Integer scheduleId = null;
}
