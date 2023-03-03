package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BonusOpActivityInfo.*;
import org.sorapointa.proto.BonusOpActivityInfo;

public class OpActivityInfo {
    @Tag(tag=2) public Integer activityId = null;
    @Tag(tag=6) public Integer endTime = null;
    @Tag(tag=5) public Integer beginTime = null;
    @Tag(tag=1) public Boolean isHasChange = null;
    @Tag(tag=13) public Integer scheduleId = null;
    @Tag(tag=12) public BonusOpActivityInfo bonusInfo = null;
}
