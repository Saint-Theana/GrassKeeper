package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetRecentMpPlayerListRsp {
    public enum GetRecentMpPlayerListRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4042) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public List<FriendBrief> recentMpPlayerBriefList = new ArrayList<>();
}
