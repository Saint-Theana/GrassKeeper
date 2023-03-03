package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChallengeBrief.*;
import org.sorapointa.proto.ChallengeBrief;
import org.sorapointa.proto.CustomDungeonFinishType.*;
import org.sorapointa.proto.CustomDungeonFinishType;

public class CustomDungeonResultInfo {
    @Tag(tag=12) public Boolean isLiked = null;
    @Tag(tag=9) public Integer gotCoinNum = null;
    @Tag(tag=6) public List<ChallengeBrief> childChallengeList = new ArrayList<>();
    @Tag(tag=3) public Long dungeonGuid = null;
    @Tag(tag=7) public Integer finishType = null;
    @Tag(tag=11) public Integer timeCost = null;
    @Tag(tag=2) public Boolean isArriveFinish = null;
    @Tag(tag=14) public Boolean isStored = null;
}
