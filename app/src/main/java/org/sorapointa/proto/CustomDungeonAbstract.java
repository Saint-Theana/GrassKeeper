package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CustomDungeonAbstract {
    public static class MapBrickStatisticsMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=12) public List<MapBrickStatisticsMap> brickStatisticsMap = new ArrayList<>();
    @Tag(tag=3) public Integer firstPublishTime = null;
    @Tag(tag=15) public Integer totalCoinNum = null;
    @Tag(tag=6) public Integer lastPublishTime = null;
    @Tag(tag=7) public Integer finishRoomId = null;
}
