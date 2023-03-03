package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WeeklyBossResinDiscountInfo.*;
import org.sorapointa.proto.WeeklyBossResinDiscountInfo;

public class DungeonEntryInfo {
    @Tag(tag=6) public Integer endTime = null;
    @Tag(tag=5) public Integer dungeonId = null;
    @Tag(tag=12) public Integer bossChestNum = null;
    @Tag(tag=13) public Integer maxBossChestNum = null;
    @Tag(tag=11) public Integer nextRefreshTime = null;
    @Tag(tag=9) public WeeklyBossResinDiscountInfo weeklyBossResinDiscountInfo = null;
    @Tag(tag=15) public Integer startTime = null;
    @Tag(tag=4) public Boolean isPassed = null;
    @Tag(tag=7) public Integer leftTimes = null;
}
