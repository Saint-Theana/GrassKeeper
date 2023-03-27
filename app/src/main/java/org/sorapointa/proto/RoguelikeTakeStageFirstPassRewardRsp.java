package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RoguelikeTakeStageFirstPassRewardRsp {
    public enum RoguelikeTakeStageFirstPassRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8650) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer stageId = null;
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
}
