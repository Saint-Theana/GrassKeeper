package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivitySetGiftWishReq {
    public static class MapGiftNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum ActivitySetGiftWishReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8597) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public Integer scheduleId = null;
    @Tag(tag=7) public List<MapGiftNumMap> giftNumMap = new ArrayList<>();
}
