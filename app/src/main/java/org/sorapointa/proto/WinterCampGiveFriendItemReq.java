package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WinterCampGiveFriendItemReq {
    public enum WinterCampGiveFriendItemReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8528) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=5) public List<ItemParam> itemList = new ArrayList<>();
    @Tag(tag=2) public Integer uid = null;
}
