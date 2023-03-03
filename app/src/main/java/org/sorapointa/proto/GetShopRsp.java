package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Shop.*;
import org.sorapointa.proto.Shop;

public class GetShopRsp {
    @Tag(tag=11) public Shop shop = null;
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
}
