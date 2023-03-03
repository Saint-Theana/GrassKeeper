package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EnterTrialAvatarActivityDungeonRsp {
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public Integer trialAvatarIndexId = null;
    @Tag(tag=10) public Integer activityId = null;
}
