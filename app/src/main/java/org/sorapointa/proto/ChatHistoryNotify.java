package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChatInfo.*;
import org.sorapointa.proto.ChatInfo;

public class ChatHistoryNotify {
    public enum ChatHistoryNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3099) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Integer channelId = null;
    @Tag(tag=12) public List<ChatInfo> chatInfo = new ArrayList<>();
}
