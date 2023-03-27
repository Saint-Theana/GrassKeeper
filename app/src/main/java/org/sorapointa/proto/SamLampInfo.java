package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SamLampInfo {
    @Tag(tag=11) public Integer days = null;
    @Tag(tag=3) public Integer progress = null;
    @Tag(tag=10) public Integer factor = null;
    @Tag(tag=9) public Integer contribution = null;
    @Tag(tag=7) public Integer phaseId = null;
    @Tag(tag=14) public List<Integer> takenPhaseRewardList = new ArrayList<>();
    @Tag(tag=15) public List<Integer> takenContributionRewardList = new ArrayList<>();
}
