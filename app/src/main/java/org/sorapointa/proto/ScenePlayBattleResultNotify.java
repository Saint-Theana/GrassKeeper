package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ScenePlayBattleSettlePlayerInfo.*;
import org.sorapointa.proto.ScenePlayBattleSettlePlayerInfo;
import org.sorapointa.proto.ScenePlayBattleSettleRewardInfo.*;
import org.sorapointa.proto.ScenePlayBattleSettleRewardInfo;

public class ScenePlayBattleResultNotify {
    @Tag(tag=1) public Boolean isWin = null;
    @Tag(tag=7) public Integer costTime = null;
    @Tag(tag=15) public Integer playType = null;
    @Tag(tag=11) public Integer playId = null;
    @Tag(tag=4) public List<ScenePlayBattleSettlePlayerInfo> settlePlayerInfoList = new ArrayList<>();
    @Tag(tag=14) public List<ScenePlayBattleSettleRewardInfo> settleRewardInfoList = new ArrayList<>();
}
