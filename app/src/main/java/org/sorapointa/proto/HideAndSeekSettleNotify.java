package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HideAndSeekSettleNotify_SettleReason.*;
import org.sorapointa.proto.HideAndSeekSettleNotify_SettleReason;
import org.sorapointa.proto.HideAndSeekSettleInfo.*;
import org.sorapointa.proto.HideAndSeekSettleInfo;
import org.sorapointa.proto.ExhibitionDisplayInfo.*;
import org.sorapointa.proto.ExhibitionDisplayInfo;

public class HideAndSeekSettleNotify {
    public enum HideAndSeekSettleNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5327) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public List<Integer> winnerList = new ArrayList<>();
    @Tag(tag=10) public Integer costTime = null;
    @Tag(tag=11) public Integer stageType = null;
    @Tag(tag=1) public Integer reason = null;
    @Tag(tag=4) public List<HideAndSeekSettleInfo> settleInfoList = new ArrayList<>();
    @Tag(tag=13) public Integer playIndex = null;
    @Tag(tag=7) public List<ExhibitionDisplayInfo> scoreList = new ArrayList<>();
    @Tag(tag=5) public Boolean isRecordScore = null;
}
