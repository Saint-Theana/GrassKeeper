package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGInviteGuestBattleRsp {
    public enum BMEFPIBIJLP {
        @Tag(tag=0) None ,
        @Tag(tag=7465) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Integer ljemjfinpph = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public Integer confirmEndTime = null;
    @Tag(tag=4) public Integer uid = null;
    @Tag(tag=5) public Integer punishEndTime = null;
}
