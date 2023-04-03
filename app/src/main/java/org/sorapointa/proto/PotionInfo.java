package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PotionStageData.*;
import org.sorapointa.proto.PotionStageData;

public class PotionInfo {
    @Tag(tag=11) public List<PotionStageData> stageList = new ArrayList<>();
}
