package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PrivateChatNotify {
    public enum PrivateChatNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5037) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public ChatInfo chatInfo = null;
}
