package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BounceConjuringGallerySettleInfo {
    public static class MapGadgetCountMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=8) public Integer normalHitCount = null;
    @Tag(tag=5,isFloat=true) public Float damage = null;
    @Tag(tag=9) public Integer feverCount = null;
    @Tag(tag=7) public Integer score = null;
    @Tag(tag=11) public OnlinePlayerInfo playerInfo = null;
    @Tag(tag=15) public List<ExhibitionDisplayInfo> cardList = new ArrayList<>();
    @Tag(tag=2) public Integer perfectHitCount = null;
    @Tag(tag=3) public List<MapGadgetCountMap> gadgetCountMap = new ArrayList<>();
    @Tag(tag=4) public Integer destroyedMachineCount = null;
}
