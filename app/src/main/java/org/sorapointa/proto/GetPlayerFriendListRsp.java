package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FriendBrief.*;
import org.sorapointa.proto.FriendBrief;

public class GetPlayerFriendListRsp {
    public enum GetPlayerFriendListRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4055) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=7) public List<FriendBrief> askFriendList = new ArrayList<>();
    @Tag(tag=11) public List<FriendBrief> friendList = new ArrayList<>();
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
