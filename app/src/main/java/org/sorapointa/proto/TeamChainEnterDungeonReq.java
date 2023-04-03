package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TeamChainChooseTeamInfo.*;
import org.sorapointa.proto.TeamChainChooseTeamInfo;

public class TeamChainEnterDungeonReq {
    public enum DLBLCLBKJFH {
        @Tag(tag=0) None ,
        @Tag(tag=21568) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=11) public List<TeamChainChooseTeamInfo> teamInfoList = new ArrayList<>();
    @Tag(tag=13) public Integer stageId = null;
    @Tag(tag=2) public Integer difficulty = null;
}
