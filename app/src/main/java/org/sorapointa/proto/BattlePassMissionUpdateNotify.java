package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BattlePassMission.*;
import org.sorapointa.proto.BattlePassMission;

public class BattlePassMissionUpdateNotify {
    public enum BattlePassMissionUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2645) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public List<BattlePassMission> missionList = new ArrayList<>();
}
