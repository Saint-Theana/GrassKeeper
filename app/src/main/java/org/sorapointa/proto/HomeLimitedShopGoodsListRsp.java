package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeLimitedShop.*;
import org.sorapointa.proto.HomeLimitedShop;

public class HomeLimitedShopGoodsListRsp {
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=12) public HomeLimitedShop shop = null;
}
