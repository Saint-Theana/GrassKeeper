package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MistTrialLevelData.*;
import org.sorapointa.proto.MistTrialLevelData;

public class MistTrialActivityInfo {
    @Tag(tag=7) public List<MistTrialLevelData> trialLevelDataList = new ArrayList<>();
}
