package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonCandidateTeamSetReadyRsp {
    public enum DungeonCandidateTeamSetReadyRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=953) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2,isSigned=true) public Integer retcode = null;
}
