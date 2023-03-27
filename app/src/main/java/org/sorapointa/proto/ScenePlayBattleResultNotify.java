package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScenePlayBattleResultNotify {
    public enum ScenePlayBattleResultNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4428) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public List<ScenePlayBattleSettleRewardInfo> settleRewardInfoList = new ArrayList<>();
    @Tag(tag=2) public Integer playId = null;
    @Tag(tag=4) public List<ScenePlayBattleSettlePlayerInfo> settlePlayerInfoList = new ArrayList<>();
    @Tag(tag=8) public Integer costTime = null;
    @Tag(tag=13) public Integer playType = null;
    @Tag(tag=12) public Boolean isWin = null;
}
