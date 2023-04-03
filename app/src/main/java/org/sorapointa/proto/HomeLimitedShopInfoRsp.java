package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeLimitedShopInfo.*;
import org.sorapointa.proto.HomeLimitedShopInfo;

public class HomeLimitedShopInfoRsp {
    public enum HomeLimitedShopInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4517) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public HomeLimitedShopInfo shopInfo = null;
}
