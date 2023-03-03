package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannelerSlabEnterLoopDungeonRsp {
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=12) public Integer pointId = null;
    @Tag(tag=6) public List<Integer> conditionIdList = new ArrayList<>();
    @Tag(tag=15) public Integer dungeonIndex = null;
    @Tag(tag=3) public Integer difficultyId = null;
}
