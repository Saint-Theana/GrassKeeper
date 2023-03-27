package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PrivateChatRsp {
    public enum PrivateChatRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5005) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer chatForbiddenEndtime = null;
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
}
