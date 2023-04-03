package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SumoTeamData.*;
import org.sorapointa.proto.SumoTeamData;

public class SumoSaveTeamRsp {
    public enum SumoSaveTeamRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8017) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer stageId = null;
    @Tag(tag=14) public Integer difficultyId = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public Integer activityId = null;
    @Tag(tag=8) public List<SumoTeamData> teamList = new ArrayList<>();
}
