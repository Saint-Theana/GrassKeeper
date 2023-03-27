package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonRestartInviteReplyNotify {
    public enum DungeonRestartInviteReplyNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=967) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public Boolean isAccept = null;
    @Tag(tag=1) public Integer playerUid = null;
}
