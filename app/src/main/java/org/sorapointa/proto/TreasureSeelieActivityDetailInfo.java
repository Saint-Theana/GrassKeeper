package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TreasureSeelieRegionData.*;
import org.sorapointa.proto.TreasureSeelieRegionData;

public class TreasureSeelieActivityDetailInfo {
    @Tag(tag=10) public Integer treasureCloseTime = null;
    @Tag(tag=8) public Boolean isContentClosed = null;
    @Tag(tag=14) public List<TreasureSeelieRegionData> regionDataList = new ArrayList<>();
}
