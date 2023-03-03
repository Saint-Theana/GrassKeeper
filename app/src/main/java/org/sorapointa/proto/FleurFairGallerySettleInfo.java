package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FleurFairGallerySettleInfo {
    public static class MapEnergyStatMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2,isSigned=true) public Integer value = null;
    }

    @Tag(tag=2) public Integer energy = null;
    @Tag(tag=11) public Integer galleryStageIndex = null;
    @Tag(tag=6) public List<MapEnergyStatMap> energyStatMap = new ArrayList<>();
    @Tag(tag=9) public Integer galleryStageCount = null;
    @Tag(tag=1) public Boolean isSuccess = null;
}
