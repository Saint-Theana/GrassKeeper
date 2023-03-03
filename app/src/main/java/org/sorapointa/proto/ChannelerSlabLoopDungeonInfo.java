package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannelerSlabLoopDungeonInfo {
    @Tag(tag=7) public Integer score = null;
    @Tag(tag=4) public Integer dungeonIndex = null;
    @Tag(tag=12) public Integer openTime = null;
    @Tag(tag=9) public Boolean isFirstPassRewardTaken = null;
    @Tag(tag=14) public List<Integer> lastConditionIdList = new ArrayList<>();
    @Tag(tag=1) public Boolean isOpen = null;
}
