package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetPlayerBlacklistRsp {
    public enum GetPlayerBlacklistRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4003) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=1) public List<FriendBrief> blacklist = new ArrayList<>();
}
