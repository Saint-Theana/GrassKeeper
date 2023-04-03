package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SumoTeamData.*;
import org.sorapointa.proto.SumoTeamData;

public class SumoSelectTeamAndEnterDungeonReq {
    public enum SumoSelectTeamAndEnterDungeonReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8433) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=4) public Integer activityId = null;
    @Tag(tag=8) public List<SumoTeamData> teamList = new ArrayList<>();
    @Tag(tag=15) public Integer stageId = null;
    @Tag(tag=12) public Integer difficultyId = null;
}
