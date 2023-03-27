package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ForceAddPlayerFriendReq {
    public enum ForceAddPlayerFriendReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4090) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer targetUid = null;
}
