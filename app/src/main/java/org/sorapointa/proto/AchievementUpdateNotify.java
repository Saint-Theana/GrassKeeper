package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AchievementUpdateNotify {
    public enum AchievementUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2695) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public List<Achievement> achievementList = new ArrayList<>();
}
