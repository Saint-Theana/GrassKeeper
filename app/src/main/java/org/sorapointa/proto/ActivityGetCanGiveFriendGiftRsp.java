package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityGetCanGiveFriendGiftRsp {
    public static class MapGiftNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum ActivityGetCanGiveFriendGiftRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8965) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer scheduleId = null;
    @Tag(tag=4) public List<MapGiftNumMap> giftNumMap = new ArrayList<>();
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
