package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannelerSlabLoopDungeonSelectConditionReq {
    @Tag(tag=4) public Integer dungeonIndex = null;
    @Tag(tag=3) public List<Integer> conditionIdList = new ArrayList<>();
    @Tag(tag=8) public Integer difficultyId = null;
}
