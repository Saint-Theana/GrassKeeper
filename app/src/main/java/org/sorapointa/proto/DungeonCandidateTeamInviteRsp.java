package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonCandidateTeamInviteRsp {
    public enum DungeonCandidateTeamInviteRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=942) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public List<Integer> invalidPlayerUids = new ArrayList<>();
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
}
