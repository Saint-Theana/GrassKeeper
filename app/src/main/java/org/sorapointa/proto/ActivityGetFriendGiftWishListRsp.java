package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ActivityFriendGiftWishData.*;
import org.sorapointa.proto.ActivityFriendGiftWishData;

public class ActivityGetFriendGiftWishListRsp {
    public enum ActivityGetFriendGiftWishListRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8145) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer scheduleId = null;
    @Tag(tag=13) public List<ActivityFriendGiftWishData> friendGiftWishList = new ArrayList<>();
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
}
