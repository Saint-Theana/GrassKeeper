package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RogueResumeDungeonRsp {
    public enum RogueResumeDungeonRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8241) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public Integer stageId = null;
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
}
