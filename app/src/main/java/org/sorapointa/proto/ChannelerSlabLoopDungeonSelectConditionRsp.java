package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannelerSlabLoopDungeonSelectConditionRsp {
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public Integer dungeonIndex = null;
    @Tag(tag=13) public List<Integer> conditionIdList = new ArrayList<>();
    @Tag(tag=14) public Integer difficultyId = null;
}
