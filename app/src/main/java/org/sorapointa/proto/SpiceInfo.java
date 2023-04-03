package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SpiceStageData.*;
import org.sorapointa.proto.SpiceStageData;

public class SpiceInfo {
    @Tag(tag=8) public Integer increaseAvatarFetterLimitTimes = null;
    @Tag(tag=11) public List<SpiceStageData> spiceStageDataList = new ArrayList<>();
    @Tag(tag=14) public Integer currentIncreaseAvatarFetterTimes = null;
}
