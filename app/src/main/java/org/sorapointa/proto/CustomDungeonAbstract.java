package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CustomDungeonAbstract {
    public static class MapBrickStatisticsMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=10) public Integer finishRoomId = null;
    @Tag(tag=2) public Integer totalCoinNum = null;
    @Tag(tag=1) public Integer firstPublishTime = null;
    @Tag(tag=4) public Integer lastPublishTime = null;
    @Tag(tag=12) public List<MapBrickStatisticsMap> brickStatisticsMap = new ArrayList<>();
}
