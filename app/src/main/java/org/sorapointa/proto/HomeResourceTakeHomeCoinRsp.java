package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeResource.*;
import org.sorapointa.proto.HomeResource;

public class HomeResourceTakeHomeCoinRsp {
    public enum HomeResourceTakeHomeCoinRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4573) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public HomeResource homeCoin = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
}
