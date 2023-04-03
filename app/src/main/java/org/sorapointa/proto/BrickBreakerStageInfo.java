package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BrickBreakerStageType.*;
import org.sorapointa.proto.BrickBreakerStageType;
import org.sorapointa.proto.BrickBreakerPlayerBattleInfo.*;
import org.sorapointa.proto.BrickBreakerPlayerBattleInfo;

public class BrickBreakerStageInfo {
    @Tag(tag=12) public Integer levelId = null;
    @Tag(tag=7) public Integer stageType = null;
    @Tag(tag=2) public List<BrickBreakerPlayerBattleInfo> battleInfoList = new ArrayList<>();
}
