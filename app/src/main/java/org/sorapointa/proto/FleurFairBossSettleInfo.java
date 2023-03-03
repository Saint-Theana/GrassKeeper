package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FleurFairPlayerStatInfo.*;
import org.sorapointa.proto.FleurFairPlayerStatInfo;

public class FleurFairBossSettleInfo {
    @Tag(tag=15) public Integer rewardTokenNum = null;
    @Tag(tag=1) public List<FleurFairPlayerStatInfo> statInfoList = new ArrayList<>();
    @Tag(tag=10) public Boolean isSuccess = null;
    @Tag(tag=12) public Integer energy = null;
    @Tag(tag=8) public Integer costTime = null;
}
