package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ExhibitionDisplayInfo.*;
import org.sorapointa.proto.ExhibitionDisplayInfo;
import org.sorapointa.proto.HideAndSeekSettleInfo.*;
import org.sorapointa.proto.HideAndSeekSettleInfo;

public class HideAndSeekSettleNotify {
    public enum SettleReason {
        @Tag(tag=0) SETTLE_REASON_TIME_OUT ,
        @Tag(tag=1) SETTLE_REASON_PLAY_END ,
        @Tag(tag=2) SETTLE_REASON_PLAYER_QUIT ;
    }

    @Tag(tag=2) public Integer costTime = null;
    @Tag(tag=8) public List<HideAndSeekSettleInfo> settleInfoList = new ArrayList<>();
    @Tag(tag=15) public List<Integer> winnerList = new ArrayList<>();
    @Tag(tag=4) public SettleReason reason = null;
    @Tag(tag=13) public Integer playIndex = null;
    @Tag(tag=6) public Boolean isRecordScore = null;
    @Tag(tag=9) public List<ExhibitionDisplayInfo> scoreList = new ArrayList<>();
    @Tag(tag=14) public Integer stageType = null;
}
