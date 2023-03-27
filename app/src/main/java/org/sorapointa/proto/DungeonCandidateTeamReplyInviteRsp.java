package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonCandidateTeamReplyInviteRsp {
    public enum DungeonCandidateTeamReplyInviteRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=952) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Boolean isTransPoint = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
}
