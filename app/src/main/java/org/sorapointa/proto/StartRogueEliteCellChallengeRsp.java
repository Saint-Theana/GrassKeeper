package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class StartRogueEliteCellChallengeRsp {
    public enum StartRogueEliteCellChallengeRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8611) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer dungeonId = null;
    @Tag(tag=5) public Integer cellId = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
}
