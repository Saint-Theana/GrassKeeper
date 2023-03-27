package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerChatCDNotify {
    public enum PlayerChatCDNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3277) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public Integer overTime = null;
}
