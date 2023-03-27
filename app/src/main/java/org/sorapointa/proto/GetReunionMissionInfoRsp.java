package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetReunionMissionInfoRsp {
    public enum GetReunionMissionInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5075) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public ReunionMissionInfo missionInfo = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
}
