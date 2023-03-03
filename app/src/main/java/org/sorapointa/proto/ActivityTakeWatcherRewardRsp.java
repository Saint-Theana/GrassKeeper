package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityTakeWatcherRewardRsp {
    @Tag(tag=14) public Integer activityId = null;
    @Tag(tag=7) public Integer watcherId = null;
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
}
