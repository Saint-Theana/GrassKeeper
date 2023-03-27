package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ForceAddPlayerFriendRsp {
    public enum ForceAddPlayerFriendRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4054) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public FriendBrief targetFriendBrief = null;
    @Tag(tag=14) public Integer targetUid = null;
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
}
