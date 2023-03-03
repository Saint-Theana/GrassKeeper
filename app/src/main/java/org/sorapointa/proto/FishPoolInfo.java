package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FishPoolInfo {
    @Tag(tag=1) public Integer poolId = null;
    @Tag(tag=2) public List<Integer> fishAreaList = new ArrayList<>();
    @Tag(tag=3) public Integer todayFishNum = null;
}
