package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MechanicusSettleInfo {
    @Tag(tag=15) public Long sceneTimeMs = null;
    @Tag(tag=7) public Integer totalToken = null;
    @Tag(tag=6) public Boolean isSuccess = null;
    @Tag(tag=1) public Integer realToken = null;
    @Tag(tag=12) public Integer groupId = null;
    @Tag(tag=11) public Integer difficultyPercentage = null;
    @Tag(tag=13) public Integer playIndex = null;
    @Tag(tag=4) public List<MultistageSettleWatcherInfo> watcherList = new ArrayList<>();
}
