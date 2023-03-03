package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.VintagePresentLevelData.*;
import org.sorapointa.proto.VintagePresentLevelData;

public class VintagePresentStageData {
    public static class MapPresentLevelMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public VintagePresentLevelData value = null;
    }

    @Tag(tag=1) public Integer openTime = null;
    @Tag(tag=15) public Integer stageId = null;
    @Tag(tag=13) public Boolean isFinish = null;
    @Tag(tag=10) public Boolean isOpen = null;
    @Tag(tag=2) public List<MapPresentLevelMap> presentLevelMap = new ArrayList<>();
}
