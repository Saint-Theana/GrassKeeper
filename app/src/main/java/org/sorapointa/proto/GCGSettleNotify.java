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
    @Tag(tag=7) public Integer gameId = null;
    @Tag(tag=2) public Integer businessType = null;
    @Tag(tag=13) public Boolean isWin = null;
    @Tag(tag=9) public List<ItemParam> rewardItemList = new ArrayList<>();
    @Tag(tag=6) public List<Integer> finishedChallengeIdList = new ArrayList<>();
    @Tag(tag=3) public Integer reason = null;
}
