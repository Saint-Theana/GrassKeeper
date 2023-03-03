package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MultistageSettleWatcherInfo.*;
import org.sorapointa.proto.MultistageSettleWatcherInfo;

public class InBattleMechanicusSettleInfo {
    @Tag(tag=15) public Long sceneTimeMs = null;
    @Tag(tag=4) public Integer totalToken = null;
    @Tag(tag=8) public Integer realToken = null;
    @Tag(tag=7) public List<MultistageSettleWatcherInfo> watcherList = new ArrayList<>();
    @Tag(tag=6) public Boolean isSuccess = null;
    @Tag(tag=3) public Integer playIndex = null;
    @Tag(tag=10) public Integer difficultyPercentage = null;
    @Tag(tag=13) public Integer groupId = null;
}
