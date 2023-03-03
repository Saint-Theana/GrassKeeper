package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Achievement.*;
import org.sorapointa.proto.Achievement;

public class AchievementAllDataNotify {
    @Tag(tag=4) public List<Achievement> achievementList = new ArrayList<>();
    @Tag(tag=2) public List<Integer> rewardTakenGoalIdList = new ArrayList<>();
}
