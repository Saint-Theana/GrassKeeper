package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeCoopRewardRsp {
    public enum TakeCoopRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1960) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer rewardConfigId = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
}
