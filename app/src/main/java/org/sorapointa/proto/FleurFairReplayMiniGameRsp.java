package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FleurFairReplayMiniGameRsp {
    public enum FleurFairReplayMiniGameRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2040) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer minigameId = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
}
