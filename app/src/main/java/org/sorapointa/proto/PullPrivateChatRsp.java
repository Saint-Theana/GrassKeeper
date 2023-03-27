package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PullPrivateChatRsp {
    public enum PullPrivateChatRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5030) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public List<ChatInfo> chatInfo = new ArrayList<>();
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
}
