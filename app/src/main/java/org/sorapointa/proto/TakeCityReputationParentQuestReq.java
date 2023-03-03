package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeCityReputationParentQuestReq {
    @Tag(tag=1) public Integer cityId = null;
    @Tag(tag=6) public List<Integer> parentQuestList = new ArrayList<>();
}
