package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TowerDailyRewardProgressChangeNotify {
    @Tag(tag=15) public Integer dailyFloorId = null;
    @Tag(tag=9) public Integer dailyLevelIndex = null;
}
