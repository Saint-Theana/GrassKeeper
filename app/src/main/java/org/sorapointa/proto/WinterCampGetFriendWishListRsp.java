package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WinterCampFriendWishData.*;
import org.sorapointa.proto.WinterCampFriendWishData;

public class WinterCampGetFriendWishListRsp {
    public enum WinterCampGetFriendWishListRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8987) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public List<WinterCampFriendWishData> wishDataList = new ArrayList<>();
}
