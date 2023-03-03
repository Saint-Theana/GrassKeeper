package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BattlePassSchedule.*;
import org.sorapointa.proto.BattlePassSchedule;

public class BattlePassCurScheduleUpdateNotify {
    @Tag(tag=11) public Boolean haveCurSchedule = null;
    @Tag(tag=1) public BattlePassSchedule curSchedule = null;
}
