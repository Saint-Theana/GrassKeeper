package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OnlinePlayerInfo.*;
import org.sorapointa.proto.OnlinePlayerInfo;

public class HomeGetOnlineStatusRsp {
    public enum HomeGetOnlineStatusRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4886) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public List<OnlinePlayerInfo> playerInfoList = new ArrayList<>();
}
