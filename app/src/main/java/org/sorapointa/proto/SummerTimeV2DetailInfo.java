package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SummerTimeV2BoatStageInfo.*;
import org.sorapointa.proto.SummerTimeV2BoatStageInfo;
import org.sorapointa.proto.SummerTimeV2DungeonStageInfo.*;
import org.sorapointa.proto.SummerTimeV2DungeonStageInfo;

public class SummerTimeV2DetailInfo {
    @Tag(tag=13) public List<SummerTimeV2DungeonStageInfo> dungeonStageInfoList = new ArrayList<>();
    @Tag(tag=10) public Integer curDungeonRewardLimit = null;
    @Tag(tag=4) public Boolean isContentClosed = null;
    @Tag(tag=5) public Integer takenRewardCount = null;
    @Tag(tag=15) public List<SummerTimeV2BoatStageInfo> boatStageInfoList = new ArrayList<>();
}
