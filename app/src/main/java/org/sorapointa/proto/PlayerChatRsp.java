package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerChatRsp {
    public enum PlayerChatRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3480) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer chatForbiddenEndtime = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
}
