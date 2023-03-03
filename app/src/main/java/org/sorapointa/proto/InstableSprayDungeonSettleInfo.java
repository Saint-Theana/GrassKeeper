package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InstableSprayDungeonSettleInfo {
    @Tag(tag=1) public Integer stageId = null;
    @Tag(tag=4) public List<Integer> scoreList = new ArrayList<>();
    @Tag(tag=13) public Boolean isNewRecord = null;
    @Tag(tag=5) public Integer difficulty = null;
}
