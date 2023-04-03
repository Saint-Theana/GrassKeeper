package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;


public class AchievementAllDataNotify {
    public enum AchievementAllDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2688) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public List<Integer> rewardTakenGoalIdList = new ArrayList<>();
    @Tag(tag=4) public List<Achievement> achievementList = new ArrayList<>();
}
