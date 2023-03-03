package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OnlinePlayerInfo.*;
import org.sorapointa.proto.OnlinePlayerInfo;

public class GetOnlinePlayerListRsp {
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public Integer param = null;
    @Tag(tag=5) public List<OnlinePlayerInfo> playerInfoList = new ArrayList<>();
}
