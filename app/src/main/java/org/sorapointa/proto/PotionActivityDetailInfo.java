package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PotionActivityDetailInfo {
    @Tag(tag=11) public List<PotionStageData> stageList = new ArrayList<>();
}
