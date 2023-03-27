package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MistTrialActivityInfo {
    @Tag(tag=7) public List<MistTrialLevelData> trialLevelDataList = new ArrayList<>();
}
