package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EffigyDailyInfo.*;
import org.sorapointa.proto.EffigyDailyInfo;

public class EffigyActivityDetailInfo {
    @Tag(tag=5) public Integer curScore = null;
    @Tag(tag=14) public List<EffigyDailyInfo> dailyInfoList = new ArrayList<>();
    @Tag(tag=9) public Integer lastDifficultyId = null;
    @Tag(tag=2) public List<Integer> takenRewardIndexList = new ArrayList<>();
}
