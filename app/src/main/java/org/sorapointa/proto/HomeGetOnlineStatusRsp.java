package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OnlinePlayerInfo.*;
import org.sorapointa.proto.OnlinePlayerInfo;

public class HomeGetOnlineStatusRsp {
    @Tag(tag=13) public List<OnlinePlayerInfo> playerInfoList = new ArrayList<>();
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
}
