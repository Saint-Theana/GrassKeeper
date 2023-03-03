package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FishInfo.*;
import org.sorapointa.proto.FishInfo;
import org.sorapointa.proto.FishingScore.*;
import org.sorapointa.proto.FishingScore;

public class FishingGallerySettleInfo {
    public static class MapFishMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public FishInfo value = null;
    }

    @Tag(tag=11) public List<MapFishMap> fishMap = new ArrayList<>();
    @Tag(tag=15) public List<FishingScore> fishingScoreList = new ArrayList<>();
}
