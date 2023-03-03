package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlantFlowerFriendFlowerWishData.*;
import org.sorapointa.proto.PlantFlowerFriendFlowerWishData;

public class PlantFlowerGetFriendFlowerWishListRsp {
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public Integer scheduleId = null;
    @Tag(tag=9) public List<PlantFlowerFriendFlowerWishData> friendFlowerWishList = new ArrayList<>();
}
