package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivitySelectAvatarCardRsp {
    @Tag(tag=4) public Integer activityId = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public Integer rewardId = null;
}
