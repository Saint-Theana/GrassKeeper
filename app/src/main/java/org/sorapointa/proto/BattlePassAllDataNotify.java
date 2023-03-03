package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BattlePassMission.*;
import org.sorapointa.proto.BattlePassMission;
import org.sorapointa.proto.BattlePassSchedule.*;
import org.sorapointa.proto.BattlePassSchedule;

public class BattlePassAllDataNotify {
    @Tag(tag=2) public Boolean haveCurSchedule = null;
    @Tag(tag=4) public List<BattlePassMission> missionList = new ArrayList<>();
    @Tag(tag=1) public BattlePassSchedule curSchedule = null;
}
