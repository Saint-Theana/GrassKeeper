package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SummerTimeV2BoatStageInfo.*;
import org.sorapointa.proto.SummerTimeV2BoatStageInfo;
import org.sorapointa.proto.SummerTimeV2DungeonStageInfo.*;
import org.sorapointa.proto.SummerTimeV2DungeonStageInfo;

public class SummerTimeV2Info {
    @Tag(tag=7) public Boolean isContentClosed = null;
    @Tag(tag=10) public Integer curDungeonRewardLimit = null;
    @Tag(tag=6) public List<SummerTimeV2BoatStageInfo> boatStageInfoList = new ArrayList<>();
    @Tag(tag=14) public Integer takenRewardCount = null;
    @Tag(tag=11) public List<SummerTimeV2DungeonStageInfo> dungeonStageInfoList = new ArrayList<>();
}
