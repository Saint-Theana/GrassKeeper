package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ArenaChallengeChildChallengeInfo.*;
import org.sorapointa.proto.ArenaChallengeChildChallengeInfo;

public class ArenaChallengeFinishNotify {
    @Tag(tag=13) public Integer arenaChallengeLevel = null;
    @Tag(tag=3) public Integer arenaChallengeId = null;
    @Tag(tag=2) public List<ArenaChallengeChildChallengeInfo> childChallengeList = new ArrayList<>();
    @Tag(tag=12) public Boolean isSuccess = null;
}
