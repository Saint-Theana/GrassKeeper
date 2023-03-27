package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerGetForceQuitBanInfoRsp {
    public enum PlayerGetForceQuitBanInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4157) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public Integer expireTime = null;
    @Tag(tag=10) public Integer matchId = null;
}
