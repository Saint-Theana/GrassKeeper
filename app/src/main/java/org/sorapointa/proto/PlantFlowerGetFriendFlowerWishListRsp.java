package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlantFlowerGetFriendFlowerWishListRsp {
    public enum PlantFlowerGetFriendFlowerWishListRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8025) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public Integer scheduleId = null;
    @Tag(tag=1) public List<PlantFlowerFriendFlowerWishData> friendFlowerWishList = new ArrayList<>();
}
