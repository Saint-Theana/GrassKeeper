package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GallerySettleInfo {
    public static class MapEnergyStatMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2,isSigned=true) public Integer value = null;
    }

    @Tag(tag=5) public Boolean isSuccess = null;
    @Tag(tag=7) public Integer energy = null;
    @Tag(tag=9) public List<MapEnergyStatMap> energyStatMap = new ArrayList<>();
    @Tag(tag=14) public Integer galleryStageCount = null;
    @Tag(tag=15) public Integer galleryStageIndex = null;
}
