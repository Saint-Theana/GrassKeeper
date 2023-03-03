package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SalvageChallengeInfo.*;
import org.sorapointa.proto.SalvageChallengeInfo;

public class SalvageStageInfo {
    @Tag(tag=9) public List<SalvageChallengeInfo> challengeInfoList = new ArrayList<>();
    @Tag(tag=10) public Boolean isOpen = null;
    @Tag(tag=2) public Integer stageId = null;
}
