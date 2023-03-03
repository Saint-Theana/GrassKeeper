package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WinterCampFriendWishData.*;
import org.sorapointa.proto.WinterCampFriendWishData;

public class WinterCampGetFriendWishListRsp {
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public List<WinterCampFriendWishData> wishDataList = new ArrayList<>();
}
