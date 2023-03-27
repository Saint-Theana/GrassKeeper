package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TeamChainInfo {
    @Tag(tag=10) public List<TeamChainStageData> stageDataList = new ArrayList<>();
    @Tag(tag=11) public Boolean isTokenCostumeReward = null;
}
