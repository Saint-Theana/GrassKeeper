package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetSignInRewardReq {
    @Tag(tag=10) public Integer scheduleId = null;
    @Tag(tag=3) public Integer rewardDay = null;
}
