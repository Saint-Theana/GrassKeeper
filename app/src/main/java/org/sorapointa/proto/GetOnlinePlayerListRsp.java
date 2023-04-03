package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OnlinePlayerInfo.*;
import org.sorapointa.proto.OnlinePlayerInfo;

public class GetOnlinePlayerListRsp {
    public enum GetOnlinePlayerListRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=62) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Integer param = null;
    @Tag(tag=9) public List<OnlinePlayerInfo> playerInfoList = new ArrayList<>();
}
