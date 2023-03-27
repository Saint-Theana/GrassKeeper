package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MechanicusCandidateTeamCreateRsp {
    public enum MechanicusCandidateTeamCreateRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3969) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Integer difficultLevel = null;
    @Tag(tag=15) public Integer dungeonId = null;
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
}
