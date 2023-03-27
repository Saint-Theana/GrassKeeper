package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannellerSlabLoopDungeonInfo {
    @Tag(tag=7) public Integer dungeonIndex = null;
    @Tag(tag=4) public Integer score = null;
    @Tag(tag=2) public Boolean isOpen = null;
    @Tag(tag=11) public Boolean isFirstPassRewardTaken = null;
    @Tag(tag=3) public Integer openTime = null;
    @Tag(tag=1) public List<Integer> lastConditionIdList = new ArrayList<>();
}
