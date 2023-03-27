package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TowerDailyRewardProgressChangeNotify {
    public enum TowerDailyRewardProgressChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2498) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Integer dailyLevelIndex = null;
    @Tag(tag=3) public Integer dailyFloorId = null;
}
