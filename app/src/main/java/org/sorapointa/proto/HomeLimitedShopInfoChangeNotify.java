package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeLimitedShopInfoChangeNotify {
    public enum HomeLimitedShopInfoChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4552) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public List<HomeLimitedShopGoods> goodsList = new ArrayList<>();
}
