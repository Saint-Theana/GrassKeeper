package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ExpeditionChallengeInfo.*;
import org.sorapointa.proto.ExpeditionChallengeInfo;
import org.sorapointa.proto.ExpeditionPathInfo.*;
import org.sorapointa.proto.ExpeditionPathInfo;

public class ExpeditionActivityDetailInfo {
    @Tag(tag=5) public Integer curChallengeId = null;
    @Tag(tag=10) public List<ExpeditionChallengeInfo> challengeInfoList = new ArrayList<>();
    @Tag(tag=2) public Integer expeditionCount = null;
    @Tag(tag=4) public Integer contentCloseTime = null;
    @Tag(tag=8) public Boolean isContentClosed = null;
    @Tag(tag=15) public List<ExpeditionPathInfo> pathInfoList = new ArrayList<>();
}
