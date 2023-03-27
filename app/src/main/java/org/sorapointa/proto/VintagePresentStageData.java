package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintagePresentStageData {
    public static class MapPresentLevelMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public VintagePresentLevelData value = null;
    }

    @Tag(tag=4) public Boolean isFinish = null;
    @Tag(tag=14) public Integer openTime = null;
    @Tag(tag=9) public Boolean isOpen = null;
    @Tag(tag=7) public List<MapPresentLevelMap> presentLevelMap = new ArrayList<>();
    @Tag(tag=15) public Integer stageId = null;
}
