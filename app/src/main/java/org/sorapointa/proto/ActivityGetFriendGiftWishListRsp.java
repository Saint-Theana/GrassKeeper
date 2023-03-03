package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ActivityFriendGiftWishData.*;
import org.sorapointa.proto.ActivityFriendGiftWishData;

public class ActivityGetFriendGiftWishListRsp {
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public List<ActivityFriendGiftWishData> friendGiftWishList = new ArrayList<>();
    @Tag(tag=10) public Integer scheduleId = null;
}
