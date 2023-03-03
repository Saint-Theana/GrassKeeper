package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeFishFarmingInfo {
    @Tag(tag=11) public List<Integer> fishIdList = new ArrayList<>();
    @Tag(tag=14) public Integer fishpondGuid = null;
}
