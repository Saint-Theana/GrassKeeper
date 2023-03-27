package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PSNFriendListNotify {
    public enum PSNFriendListNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4067) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public List<FriendBrief> psnFriendList = new ArrayList<>();
}
