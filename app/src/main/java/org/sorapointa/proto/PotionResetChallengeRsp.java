package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PotionResetChallengeRsp {
    public enum PotionResetChallengeRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8220) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public PotionStageData stageData = null;
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
}
