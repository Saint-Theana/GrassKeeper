package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EffigyDailyInfo.*;
import org.sorapointa.proto.EffigyDailyInfo;

public class EffigyInfo {
    @Tag(tag=7) public List<Integer> takenRewardIndexList = new ArrayList<>();
    @Tag(tag=9) public List<EffigyDailyInfo> dailyInfoList = new ArrayList<>();
    @Tag(tag=5) public Integer curScore = null;
    @Tag(tag=10) public Integer lastDifficultyId = null;
}
