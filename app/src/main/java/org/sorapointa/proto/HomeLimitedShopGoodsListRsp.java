package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeLimitedShop.*;
import org.sorapointa.proto.HomeLimitedShop;

public class HomeLimitedShopGoodsListRsp {
    public enum HomeLimitedShopGoodsListRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4770) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public HomeLimitedShop shop = null;
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
}
