package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RemoveBlacklistRsp {
    public enum RemoveBlacklistRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4045) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer targetUid = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
}
