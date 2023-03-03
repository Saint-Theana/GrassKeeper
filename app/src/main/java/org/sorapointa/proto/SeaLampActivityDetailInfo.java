package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SeaLampActivityDetailInfo {
    @Tag(tag=14) public Integer phaseId = null;
    @Tag(tag=1) public List<Integer> takenPhaseRewardList = new ArrayList<>();
    @Tag(tag=7) public List<Integer> takenContributionRewardList = new ArrayList<>();
    @Tag(tag=8) public Integer progress = null;
    @Tag(tag=15) public Integer contribution = null;
    @Tag(tag=13) public Integer factor = null;
    @Tag(tag=4) public Integer days = null;
}
