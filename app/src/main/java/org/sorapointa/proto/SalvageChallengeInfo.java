package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SalvageChallengeInfo {
    @Tag(tag=2) public Boolean isUnlock = null;
    @Tag(tag=14) public Integer challengeType = null;
    @Tag(tag=8) public BundleInfo bundleInfo = null;
    @Tag(tag=5) public ScoreChallengeInfo scoreChallengeInfo = null;
    @Tag(tag=1) public Integer bossChallengeId = null;
}
