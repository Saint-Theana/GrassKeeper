package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomePlantSubFieldData {
    @Tag(tag=15) public Integer endTime = null;
    @Tag(tag=4) public List<Integer> entityIdList = new ArrayList<>();
    @Tag(tag=10) public Integer homeGatherId = null;
    @Tag(tag=8) public Integer fieldStatus = null;
    @Tag(tag=6) public Integer seedId = null;
}
