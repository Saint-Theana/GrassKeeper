package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGEndReason.*;
import org.sorapointa.proto.GCGEndReason;
import org.sorapointa.proto.GCGGameBusinessType.*;
import org.sorapointa.proto.GCGGameBusinessType;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class GCGSettleNotify {
    public enum NAEPLBPDGDG {
        @Tag(tag=0) None ,
        @Tag(tag=7773) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public List<Integer> forbidFinishChallengeList = new ArrayList<>();
    @Tag(tag=12) public Integer reason = null;
    @Tag(tag=4) public Boolean isWin = null;
    @Tag(tag=9) public List<ItemParam> rewardItemList = new ArrayList<>();
    @Tag(tag=11) public List<Integer> finishedChallengeIdList = new ArrayList<>();
    @Tag(tag=2) public Integer winControllerId = null;
    @Tag(tag=7) public Integer gameId = null;
    @Tag(tag=3) public Integer businessType = null;
}
