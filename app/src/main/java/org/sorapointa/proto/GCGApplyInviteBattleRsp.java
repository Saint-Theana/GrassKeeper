package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGApplyInviteBattleRsp {
    public enum NCBEIOCBEMI {
        @Tag(tag=0) None ,
        @Tag(tag=7358) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Integer punishEndTime = null;
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
}
