package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetOnlinePlayerInfoReq {
    public enum GetOnlinePlayerInfoReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=3) public Boolean isOnlineId = null;
    @Tag(tag=4) public Integer targetUid = null;
    @Tag(tag=10) public String onlineId = null;
    @Tag(tag=12) public String psnId = null;
}
