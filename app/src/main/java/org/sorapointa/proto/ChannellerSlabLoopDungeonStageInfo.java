package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannellerSlabLoopDungeonStageInfo {
    @Tag(tag=10) public List<ChannellerSlabLoopDungeonInfo> dungeonInfoList = new ArrayList<>();
    @Tag(tag=12) public Integer openTime = null;
    @Tag(tag=2) public Integer lastDifficultyId = null;
    @Tag(tag=8) public Boolean isOpen = null;
    @Tag(tag=9) public List<Integer> takenRewardIndexList = new ArrayList<>();
}
