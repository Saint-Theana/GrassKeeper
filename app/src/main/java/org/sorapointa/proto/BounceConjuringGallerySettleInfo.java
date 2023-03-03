package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ExhibitionDisplayInfo.*;
import org.sorapointa.proto.ExhibitionDisplayInfo;
import org.sorapointa.proto.OnlinePlayerInfo.*;
import org.sorapointa.proto.OnlinePlayerInfo;

public class BounceConjuringGallerySettleInfo {
    public static class MapGadgetCountMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=14) public OnlinePlayerInfo playerInfo = null;
    @Tag(tag=5) public Integer destroyedMachineCount = null;
    @Tag(tag=6) public Integer feverCount = null;
    @Tag(tag=4) public Integer normalHitCount = null;
    @Tag(tag=11,isFloat=true) public Float damage = null;
    @Tag(tag=15) public List<MapGadgetCountMap> gadgetCountMap = new ArrayList<>();
    @Tag(tag=12) public Integer score = null;
    @Tag(tag=8) public Integer perfectHitCount = null;
    @Tag(tag=7) public List<ExhibitionDisplayInfo> cardList = new ArrayList<>();
}
