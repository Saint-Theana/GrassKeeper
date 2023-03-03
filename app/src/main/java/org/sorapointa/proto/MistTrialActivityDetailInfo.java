package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MistTrialLevelData.*;
import org.sorapointa.proto.MistTrialLevelData;

public class MistTrialActivityDetailInfo {
    @Tag(tag=5) public List<MistTrialLevelData> trialLevelDataList = new ArrayList<>();
}
