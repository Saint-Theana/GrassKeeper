package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChannelerSlabLoopDungeonInfo.*;
import org.sorapointa.proto.ChannelerSlabLoopDungeonInfo;

public class ChannelerSlabLoopDungeonStageInfo {
    @Tag(tag=15) public List<ChannelerSlabLoopDungeonInfo> dungeonInfoList = new ArrayList<>();
    @Tag(tag=5) public List<Integer> takenRewardIndexList = new ArrayList<>();
    @Tag(tag=11) public Boolean isOpen = null;
    @Tag(tag=6) public Integer lastDifficultyId = null;
    @Tag(tag=3) public Integer openTime = null;
}
