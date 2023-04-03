package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BattlePassSchedule.*;
import org.sorapointa.proto.BattlePassSchedule;
import org.sorapointa.proto.BattlePassMission.*;
import org.sorapointa.proto.BattlePassMission;

public class BattlePassAllDataNotify {
    public enum BattlePassAllDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2638) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Boolean haveCurSchedule = null;
    @Tag(tag=15) public BattlePassSchedule curSchedule = null;
    @Tag(tag=3) public List<BattlePassMission> missionList = new ArrayList<>();
}
