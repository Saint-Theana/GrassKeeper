package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OnlinePlayerInfo.*;
import org.sorapointa.proto.OnlinePlayerInfo;

public class GetOnlinePlayerInfoRsp {
    public enum GetOnlinePlayerInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=39) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public OnlinePlayerInfo targetPlayerInfo = null;
    @Tag(tag=3) public Integer targetUid = null;
    @Tag(tag=10) public Integer param = null;
}
