package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGWeekChallengeInfo.*;
import org.sorapointa.proto.GCGWeekChallengeInfo;

public class GCGWeekChallengeInfoNotify {
    @Tag(tag=15) public List<GCGWeekChallengeInfo> challengeInfoList = new ArrayList<>();
    @Tag(tag=7) public Integer nextRefreshTime = null;
}
