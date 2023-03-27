package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AskAddFriendNotify {
    public enum AskAddFriendNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4088) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public FriendBrief targetFriendBrief = null;
    @Tag(tag=8) public Integer targetUid = null;
}
