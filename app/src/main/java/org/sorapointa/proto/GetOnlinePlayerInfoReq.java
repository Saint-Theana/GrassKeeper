package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetOnlinePlayerInfoReq {
    @Tag(tag=15) public Boolean isOnlineId = null;
    @Tag(tag=9) public Integer targetUid = null;
    @Tag(tag=7) public String onlineId = null;
    @Tag(tag=2) public String psnId = null;
}
