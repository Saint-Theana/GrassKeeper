package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ReadPrivateChatRsp {
    public enum ReadPrivateChatRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4974) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7,isSigned=true) public Integer retcode = null;
}
