package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FishingScore.*;
import org.sorapointa.proto.FishingScore;
import org.sorapointa.proto.FishInfo.*;
import org.sorapointa.proto.FishInfo;

public class FishingGallerySettleInfo {
    public static class MapFishMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public FishInfo value = null;
    }

    @Tag(tag=4) public List<FishingScore> fishingScoreList = new ArrayList<>();
    @Tag(tag=9) public List<MapFishMap> fishMap = new ArrayList<>();
}
