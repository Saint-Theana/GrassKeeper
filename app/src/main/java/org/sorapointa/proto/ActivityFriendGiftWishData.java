package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ProfilePicture.*;
import org.sorapointa.proto.ProfilePicture;

public class ActivityFriendGiftWishData {
    public static class MapGiftNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=7) public String nickname = null;
    @Tag(tag=3) public String remarkName = null;
    @Tag(tag=11) public ProfilePicture profilePicture = null;
    @Tag(tag=9) public List<MapGiftNumMap> giftNumMap = new ArrayList<>();
    @Tag(tag=8) public Integer uid = null;
}
