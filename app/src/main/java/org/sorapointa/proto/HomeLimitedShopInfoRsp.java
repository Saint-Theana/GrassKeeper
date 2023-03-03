package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeLimitedShopInfo.*;
import org.sorapointa.proto.HomeLimitedShopInfo;

public class HomeLimitedShopInfoRsp {
    @Tag(tag=10) public HomeLimitedShopInfo shopInfo = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
}
