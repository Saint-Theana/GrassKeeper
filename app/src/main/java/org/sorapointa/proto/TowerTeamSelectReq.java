package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TowerTeam.*;
import org.sorapointa.proto.TowerTeam;

public class TowerTeamSelectReq {
    public enum TowerTeamSelectReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2474) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1) public List<TowerTeam> towerTeamList = new ArrayList<>();
    @Tag(tag=11) public Integer floorId = null;
}
