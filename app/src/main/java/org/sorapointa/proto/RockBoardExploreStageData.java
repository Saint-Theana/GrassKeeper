package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RockBoardExploreStageData {
    @Tag(tag=6) public Boolean isFinish = null;
    @Tag(tag=7) public Integer openTime = null;
    @Tag(tag=5) public Boolean isOpen = null;
    @Tag(tag=3) public Integer stageId = null;
}
