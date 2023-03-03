package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityGetCanGiveFriendGiftRsp {
    public static class MapGiftNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=7) public Integer scheduleId = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public List<MapGiftNumMap> giftNumMap = new ArrayList<>();
}
