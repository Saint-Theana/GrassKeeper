package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChatChannelDataNotify {
    public enum ChatChannelDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5028) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public List<Integer> channelList = new ArrayList<>();
    @Tag(tag=7) public List<ChatChannelInfo> channelInfoList = new ArrayList<>();
}
