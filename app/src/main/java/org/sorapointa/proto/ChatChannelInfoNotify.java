package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChatChannelInfo.*;
import org.sorapointa.proto.ChatChannelInfo;

public class ChatChannelInfoNotify {
    public enum HDDAKDGMNMB {
        @Tag(tag=0) None ,
        @Tag(tag=4963) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public ChatChannelInfo channelInfo = null;
}
