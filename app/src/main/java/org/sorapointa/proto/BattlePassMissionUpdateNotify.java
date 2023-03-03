package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BattlePassMission.*;
import org.sorapointa.proto.BattlePassMission;

public class BattlePassMissionUpdateNotify {
    @Tag(tag=1) public List<BattlePassMission> missionList = new ArrayList<>();
}
