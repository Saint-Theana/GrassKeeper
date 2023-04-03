package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FriendBrief.*;
import org.sorapointa.proto.FriendBrief;

public class GetPlayerAskFriendListRsp {
    public enum GetPlayerAskFriendListRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4084) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public List<FriendBrief> askFriendList = new ArrayList<>();
}
