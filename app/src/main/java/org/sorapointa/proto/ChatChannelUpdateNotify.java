package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChatChannelInfo.*;
import org.sorapointa.proto.ChatChannelInfo;

public class ChatChannelUpdateNotify {
    public enum ChatChannelUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4979) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Boolean isCreate = null;
    @Tag(tag=6) public ChatChannelInfo channelInfo = null;
    @Tag(tag=12) public Integer channelId = null;
}
