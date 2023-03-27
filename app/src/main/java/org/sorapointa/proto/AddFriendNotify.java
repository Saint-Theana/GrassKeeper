package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AddFriendNotify {
    public enum AddFriendNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4092) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Integer targetUid = null;
    @Tag(tag=12) public FriendBrief targetFriendBrief = null;
}
