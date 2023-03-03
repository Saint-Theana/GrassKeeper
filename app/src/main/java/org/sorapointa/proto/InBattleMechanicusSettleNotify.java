package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MultistageSettleWatcherInfo.*;
import org.sorapointa.proto.MultistageSettleWatcherInfo;

public class InBattleMechanicusSettleNotify {
    @Tag(tag=15) public Integer groupId = null;
    @Tag(tag=11) public Long sceneTimeMs = null;
    @Tag(tag=6) public Integer difficultyPercentage = null;
    @Tag(tag=7) public Integer totalToken = null;
    @Tag(tag=3) public List<MultistageSettleWatcherInfo> watcherList = new ArrayList<>();
    @Tag(tag=13) public Integer realToken = null;
    @Tag(tag=2) public Boolean isSuccess = null;
    @Tag(tag=14) public Integer playIndex = null;
}
