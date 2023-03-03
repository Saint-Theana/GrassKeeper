package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.LanternRiteFireworksChallengeInfo.*;
import org.sorapointa.proto.LanternRiteFireworksChallengeInfo;

public class LanternRiteFireworksStageInfo {
    @Tag(tag=8) public Boolean isOpen = null;
    @Tag(tag=9) public List<LanternRiteFireworksChallengeInfo> challengeInfoList = new ArrayList<>();
    @Tag(tag=15) public Integer stageId = null;
}
