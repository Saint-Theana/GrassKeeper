package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ExpeditionInfo {
    @Tag(tag=2) public List<ExpeditionChallengeInfo> challengeInfoList = new ArrayList<>();
    @Tag(tag=12) public Boolean isContentClosed = null;
    @Tag(tag=3) public Integer curChallengeId = null;
    @Tag(tag=9) public Integer contentCloseTime = null;
    @Tag(tag=4) public Integer expeditionCount = null;
    @Tag(tag=13) public List<ExpeditionPathInfo> pathInfoList = new ArrayList<>();
}
