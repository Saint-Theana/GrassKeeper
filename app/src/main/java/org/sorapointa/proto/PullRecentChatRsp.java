package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PullRecentChatRsp {
    public enum PullRecentChatRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5012) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public List<ChatInfo> chatInfo = new ArrayList<>();
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
