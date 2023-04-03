package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BonusInfo.*;
import org.sorapointa.proto.BonusInfo;

public class OpActivityInfo {
    @Tag(tag=1) public Integer scheduleId = null;
    @Tag(tag=8) public Integer beginTime = null;
    @Tag(tag=15) public Integer activityId = null;
    @Tag(tag=3) public Boolean isHasChange = null;
    @Tag(tag=11) public BonusInfo bonusInfo = null;
    @Tag(tag=10) public Integer endTime = null;
}
