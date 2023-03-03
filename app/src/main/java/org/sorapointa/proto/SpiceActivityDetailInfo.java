package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SpiceStageData.*;
import org.sorapointa.proto.SpiceStageData;

public class SpiceActivityDetailInfo {
    @Tag(tag=15) public Integer currentIncreaseAvatarFetterTimes = null;
    @Tag(tag=7) public List<SpiceStageData> spiceStageDataList = new ArrayList<>();
    @Tag(tag=13) public Integer increaseAvatarFetterLimitTimes = null;
}
