package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MistTrialSettleNotify {
    public static class MapExhibitionListDataRecordMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public static class MapExhibitionListDataResultMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=15) public List<MapExhibitionListDataRecordMap> exhibitionListDataRecordMap = new ArrayList<>();
    @Tag(tag=14) public List<MapExhibitionListDataResultMap> exhibitionListDataResultMap = new ArrayList<>();
    @Tag(tag=5) public Integer dungeonSceneId = null;
}
