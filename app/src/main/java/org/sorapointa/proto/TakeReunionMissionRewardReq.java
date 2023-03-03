package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeReunionMissionRewardReq {
    @Tag(tag=7) public Integer rewardId = null;
    @Tag(tag=4) public Integer rewardIndex = null;
    @Tag(tag=12) public Integer missionId = null;
}
