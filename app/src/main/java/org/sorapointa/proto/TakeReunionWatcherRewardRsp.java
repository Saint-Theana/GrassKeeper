package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeReunionWatcherRewardRsp {
    public enum TakeReunionWatcherRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5090) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer watcherId = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public Integer missionId = null;
}
