package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeSeekFurnitureInfo {
    public static class MapPlayerScoreMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=10) public Integer curTideDurationTime = null;
    @Tag(tag=11) public Integer curTideTotalNum = null;
    @Tag(tag=8) public Integer curTideLeftNum = null;
    @Tag(tag=12) public List<MapPlayerScoreMap> playerScoreMap = new ArrayList<>();
}
