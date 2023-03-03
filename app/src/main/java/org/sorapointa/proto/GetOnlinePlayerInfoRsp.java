package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OnlinePlayerInfo.*;
import org.sorapointa.proto.OnlinePlayerInfo;

public class GetOnlinePlayerInfoRsp {
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public Integer targetUid = null;
    @Tag(tag=4) public Integer param = null;
    @Tag(tag=14) public OnlinePlayerInfo targetPlayerInfo = null;
}
