package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlantFlowerGetFriendFlowerWishListReq {
    public enum PlantFlowerGetFriendFlowerWishListReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8639) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public Integer scheduleId = null;
}
