package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeFishFarmingInfo {
    @Tag(tag=4) public Integer fishpondGuid = null;
    @Tag(tag=6) public List<Integer> fishIdList = new ArrayList<>();
}
