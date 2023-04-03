package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SumoTeamData.*;
import org.sorapointa.proto.SumoTeamData;

public class SumoSelectTeamAndEnterDungeonRsp {
    public enum SumoSelectTeamAndEnterDungeonRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8877) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Integer difficultyId = null;
    @Tag(tag=13) public Integer activityId = null;
    @Tag(tag=2) public List<SumoTeamData> teamList = new ArrayList<>();
    @Tag(tag=10) public Integer stageId = null;
}
