package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CustomDungeonFinishType.*;
import org.sorapointa.proto.CustomDungeonFinishType;
import org.sorapointa.proto.ChallengeBrief.*;
import org.sorapointa.proto.ChallengeBrief;

public class CustomDungeonResultInfo {
    @Tag(tag=2) public Integer finishType = null;
    @Tag(tag=8) public Boolean isStored = null;
    @Tag(tag=9) public Long dungeonGuid = null;
    @Tag(tag=14) public Boolean isLiked = null;
    @Tag(tag=15) public Boolean isArriveFinish = null;
    @Tag(tag=11) public Integer gotCoinNum = null;
    @Tag(tag=3) public List<ChallengeBrief> childChallengeList = new ArrayList<>();
    @Tag(tag=4) public Integer timeCost = null;
}
