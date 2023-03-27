package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SalvageStageInfo {
    @Tag(tag=10) public Boolean isOpen = null;
    @Tag(tag=15) public Integer stageId = null;
    @Tag(tag=6) public List<SalvageChallengeInfo> challengeInfoList = new ArrayList<>();
}
