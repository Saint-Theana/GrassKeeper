package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WinterCampSetWishListRsp {
    public enum WinterCampSetWishListRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8827) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public List<Integer> itemIdList = new ArrayList<>();
}
