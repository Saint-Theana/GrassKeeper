package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BattlePassCurScheduleUpdateNotify {
    public enum BattlePassCurScheduleUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2641) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public Boolean haveCurSchedule = null;
    @Tag(tag=14) public BattlePassSchedule curSchedule = null;
}
