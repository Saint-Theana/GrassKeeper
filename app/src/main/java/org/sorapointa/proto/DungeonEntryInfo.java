package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WeeklyBossResinDiscountInfo.*;
import org.sorapointa.proto.WeeklyBossResinDiscountInfo;

public class DungeonEntryInfo {
    @Tag(tag=10) public Integer maxBossChestNum = null;
    @Tag(tag=1) public Integer startTime = null;
    @Tag(tag=6) public Integer leftTimes = null;
    @Tag(tag=14) public Integer endTime = null;
    @Tag(tag=13) public WeeklyBossResinDiscountInfo weeklyBossResinDiscountInfo = null;
    @Tag(tag=3) public Integer dungeonId = null;
    @Tag(tag=5) public Integer bossChestNum = null;
    @Tag(tag=2) public Boolean isPassed = null;
    @Tag(tag=8) public Integer nextRefreshTime = null;
}
