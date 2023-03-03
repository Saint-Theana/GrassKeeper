package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScenePlayBattleInfo {
    @Tag(tag=4) public Integer mode = null;
    @Tag(tag=3) public List<Integer> progressStageList = new ArrayList<>();
    @Tag(tag=10) public Integer startTime = null;
    @Tag(tag=14) public Integer duration = null;
    @Tag(tag=12) public Integer playType = null;
    @Tag(tag=1) public Integer playId = null;
    @Tag(tag=7) public Integer prepareEndTime = null;
    @Tag(tag=11) public Integer progress = null;
    @Tag(tag=8) public Integer state = null;
    @Tag(tag=9) public Integer type = null;
}
