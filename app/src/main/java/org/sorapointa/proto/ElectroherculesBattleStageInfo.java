package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ElectroherculesBattleStageInfo {
    @Tag(tag=10) public List<ElectroherculesBattleLevelInfo> levelInfoList = new ArrayList<>();
    @Tag(tag=1) public Integer stageId = null;
    @Tag(tag=3) public Boolean isStageOpen = null;
}
