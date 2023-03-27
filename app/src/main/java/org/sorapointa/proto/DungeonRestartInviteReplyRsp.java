package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonRestartInviteReplyRsp {
    public enum DungeonRestartInviteReplyRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=995) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Boolean isTransPoint = null;
    @Tag(tag=9) public Boolean isAccept = null;
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
}
