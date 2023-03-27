package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BattlePassMission {
    @Tag(tag=6) public Integer missionId = null;
    @Tag(tag=14) public Integer missionType = null;
    @Tag(tag=9) public Integer missionStatus = null;
    @Tag(tag=11) public Integer curProgress = null;
    @Tag(tag=10) public Integer rewardBattlePassPoint = null;
    @Tag(tag=13) public Integer totalProgress = null;
}
