package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class Quest {
    public static class MapLackedNpcMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public static class MapLackedPlaceMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=1) public Integer questId = null;
    @Tag(tag=2) public Integer state = null;
    @Tag(tag=4) public Integer startTime = null;
    @Tag(tag=5) public Boolean isRandom = null;
    @Tag(tag=6) public Integer parentQuestId = null;
    @Tag(tag=7) public Integer questConfigId = null;
    @Tag(tag=8) public Integer startGameTime = null;
    @Tag(tag=9) public Integer acceptTime = null;
    @Tag(tag=10) public List<Integer> lackedNpcList = new ArrayList<>();
    @Tag(tag=11) public List<Integer> finishProgressList = new ArrayList<>();
    @Tag(tag=12) public List<Integer> failProgressList = new ArrayList<>();
    @Tag(tag=13) public List<MapLackedNpcMap> lackedNpcMap = new ArrayList<>();
    @Tag(tag=14) public List<Integer> lackedPlaceList = new ArrayList<>();
    @Tag(tag=15) public List<MapLackedPlaceMap> lackedPlaceMap = new ArrayList<>();
}
