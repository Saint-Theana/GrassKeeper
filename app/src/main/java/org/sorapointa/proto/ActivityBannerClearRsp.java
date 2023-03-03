package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityBannerClearRsp {
    @Tag(tag=4) public Integer activityId = null;
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public Integer scheduleId = null;
}
