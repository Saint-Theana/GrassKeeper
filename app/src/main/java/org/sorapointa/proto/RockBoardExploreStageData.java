package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RockBoardExploreStageData {
    @Tag(tag=1) public Boolean isFinish = null;
    @Tag(tag=9) public Integer stageId = null;
    @Tag(tag=6) public Boolean isOpen = null;
    @Tag(tag=7) public Integer openTime = null;
}
