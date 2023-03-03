package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BlitzRushStage.*;
import org.sorapointa.proto.BlitzRushStage;
import org.sorapointa.proto.ParkourLevelInfo.*;
import org.sorapointa.proto.ParkourLevelInfo;

public class BlitzRushActivityDetailInfo {
    @Tag(tag=10) public List<BlitzRushStage> stageList = new ArrayList<>();
    @Tag(tag=14) public Integer contentCloseTime = null;
    @Tag(tag=2) public Boolean isContentClosed = null;
    @Tag(tag=6) public List<ParkourLevelInfo> parkourLevelInfoList = new ArrayList<>();
}
