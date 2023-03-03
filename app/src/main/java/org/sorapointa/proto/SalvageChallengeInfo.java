package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SalvageBundleChallengeInfo.*;
import org.sorapointa.proto.SalvageBundleChallengeInfo;
import org.sorapointa.proto.SalvageScoreChallengeInfo.*;
import org.sorapointa.proto.SalvageScoreChallengeInfo;

public class SalvageChallengeInfo {
    @Tag(tag=5) public Integer challengeType = null;
    @Tag(tag=12) public Boolean isUnlock = null;
    @Tag(tag=11) public SalvageBundleChallengeInfo bundleInfo = null;
    @Tag(tag=13) public SalvageScoreChallengeInfo scoreChallengeInfo = null;
    @Tag(tag=2) public Integer bossChallengeId = null;
}
