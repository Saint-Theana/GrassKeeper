package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FleurFairBossSettleInfo {
    @Tag(tag=3) public List<FleurFairPlayerStatInfo> statInfoList = new ArrayList<>();
    @Tag(tag=4) public Integer rewardTokenNum = null;
    @Tag(tag=8) public Integer energy = null;
    @Tag(tag=2) public Integer costTime = null;
    @Tag(tag=6) public Boolean isSuccess = null;
}
