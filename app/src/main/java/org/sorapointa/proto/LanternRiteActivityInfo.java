package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.LanternRiteFireworksInfo.*;
import org.sorapointa.proto.LanternRiteFireworksInfo;
import org.sorapointa.proto.LanternProjectionInfo.*;
import org.sorapointa.proto.LanternProjectionInfo;
import org.sorapointa.proto.SalvageStageInfo.*;
import org.sorapointa.proto.SalvageStageInfo;

public class LanternRiteActivityInfo {
    @Tag(tag=6) public LanternRiteFireworksInfo fireworksInfo = null;
    @Tag(tag=11) public LanternProjectionInfo projectionInfo = null;
    @Tag(tag=9) public Boolean isContentClosed = null;
    @Tag(tag=3) public Boolean isTakenSkinReward = null;
    @Tag(tag=1) public List<SalvageStageInfo> stageInfoList = new ArrayList<>();
    @Tag(tag=7) public Boolean isMiniEldritchDungeonOpen = null;
}
