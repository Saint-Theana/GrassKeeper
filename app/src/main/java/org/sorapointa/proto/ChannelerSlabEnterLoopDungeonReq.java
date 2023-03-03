package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannelerSlabEnterLoopDungeonReq {
    @Tag(tag=9) public Integer pointId = null;
    @Tag(tag=10) public Integer dungeonIndex = null;
    @Tag(tag=5) public List<Integer> conditionIdList = new ArrayList<>();
    @Tag(tag=12) public Integer difficultyId = null;
}
