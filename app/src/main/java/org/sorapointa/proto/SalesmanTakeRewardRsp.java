package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SalesmanTakeRewardRsp {
    public enum SalesmanTakeRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2034) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Integer rewardId = null;
    @Tag(tag=5) public Integer scheduleId = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public Integer position = null;
}
