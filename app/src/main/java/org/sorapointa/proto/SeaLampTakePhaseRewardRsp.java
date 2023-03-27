package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SeaLampTakePhaseRewardRsp {
    public enum SeaLampTakePhaseRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2187) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer phaseId = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
