package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TeamChainSettleInfo {
    @Tag(tag=13) public Boolean isNewRecord = null;
    @Tag(tag=4) public Integer stageId = null;
    @Tag(tag=3) public Integer totalScore = null;
    @Tag(tag=15) public Integer difficulty = null;
    @Tag(tag=9) public List<Integer> scoreList = new ArrayList<>();
}
