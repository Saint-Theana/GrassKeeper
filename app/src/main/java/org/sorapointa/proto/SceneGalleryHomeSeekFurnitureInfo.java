package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneGalleryHomeSeekFurnitureInfo {
    public static class MapPlayerScoreMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=6) public Integer curTideLeftNum = null;
    @Tag(tag=8) public List<MapPlayerScoreMap> playerScoreMap = new ArrayList<>();
    @Tag(tag=12) public Integer curTideDurationTime = null;
    @Tag(tag=9) public Integer curTideTotalNum = null;
}
