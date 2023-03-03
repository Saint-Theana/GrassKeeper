package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityGiveFriendGiftReq {
    public static class MapGiftNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=5) public Integer uid = null;
    @Tag(tag=1) public Integer scheduleId = null;
    @Tag(tag=4) public List<MapGiftNumMap> giftNumMap = new ArrayList<>();
}
