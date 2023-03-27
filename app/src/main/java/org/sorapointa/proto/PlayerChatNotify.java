package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerChatNotify {
    public enum PlayerChatNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3092) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Integer channelId = null;
    @Tag(tag=6) public ChatInfo chatInfo = null;
}
