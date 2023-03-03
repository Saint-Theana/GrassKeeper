package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EnterTrialAvatarActivityDungeonReq {
    @Tag(tag=10) public Integer enterPointId = null;
    @Tag(tag=5) public Integer trialAvatarIndexId = null;
    @Tag(tag=14) public Integer activityId = null;
}
