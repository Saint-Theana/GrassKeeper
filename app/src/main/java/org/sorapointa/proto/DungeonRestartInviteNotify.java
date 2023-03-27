package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonRestartInviteNotify {
    public enum DungeonRestartInviteNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=990) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=11) public Integer cd = null;
    @Tag(tag=1) public Integer playerUid = null;
    @Tag(tag=7) public Integer dungeonId = null;
    @Tag(tag=14) public Integer pointId = null;
}
