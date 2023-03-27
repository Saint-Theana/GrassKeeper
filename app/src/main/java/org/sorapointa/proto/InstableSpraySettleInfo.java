package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InstableSpraySettleInfo {
    @Tag(tag=5) public Boolean isNewRecord = null;
    @Tag(tag=4) public Integer stageId = null;
    @Tag(tag=15) public Integer difficulty = null;
    @Tag(tag=10) public List<Integer> scoreList = new ArrayList<>();
}
