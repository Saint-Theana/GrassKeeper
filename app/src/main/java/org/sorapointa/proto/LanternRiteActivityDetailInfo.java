package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.LanternProjectionInfo.*;
import org.sorapointa.proto.LanternProjectionInfo;
import org.sorapointa.proto.LanternRiteFireworksInfo.*;
import org.sorapointa.proto.LanternRiteFireworksInfo;
import org.sorapointa.proto.SalvageStageInfo.*;
import org.sorapointa.proto.SalvageStageInfo;

public class LanternRiteActivityDetailInfo {
    @Tag(tag=13) public LanternProjectionInfo projectionInfo = null;
    @Tag(tag=5) public List<SalvageStageInfo> stageInfoList = new ArrayList<>();
    @Tag(tag=8) public LanternRiteFireworksInfo fireworksInfo = null;
    @Tag(tag=2) public Boolean isMiniEldritchDungeonOpen = null;
    @Tag(tag=14) public Boolean isContentClosed = null;
    @Tag(tag=6) public Boolean isTakenSkinReward = null;
}
