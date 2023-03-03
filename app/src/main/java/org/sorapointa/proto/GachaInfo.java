package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GachaUpInfo.*;
import org.sorapointa.proto.GachaUpInfo;

public class GachaInfo {
    @Tag(tag=2) public Integer tenCostItemId = null;
    @Tag(tag=14) public Integer endTime = null;
    @Tag(tag=1875) public List<Integer> displayUp4ItemList = new ArrayList<>();
    @Tag(tag=469) public Integer curScheduleDailyGachaTimes = null;
    @Tag(tag=1233) public List<GachaUpInfo> gachaUpInfoList = new ArrayList<>();
    @Tag(tag=8) public String gachaProbUrl = null;
    @Tag(tag=15) public String gachaPrefabPath = null;
    @Tag(tag=1637) public Integer wishItemId = null;
    @Tag(tag=1) public Integer beginTime = null;
    @Tag(tag=1222) public Integer wishMaxProgress = null;
    @Tag(tag=10) public Integer scheduleId = null;
    @Tag(tag=1481) public String gachaProbUrlOversea = null;
    @Tag(tag=13) public Integer gachaType = null;
    @Tag(tag=5) public Integer leftGachaTimes = null;
    @Tag(tag=2006) public List<Integer> displayUp5ItemList = new ArrayList<>();
    @Tag(tag=11) public Integer gachaTimesLimit = null;
    @Tag(tag=3) public Integer costItemNum = null;
    @Tag(tag=733) public Boolean isNewWish = null;
    @Tag(tag=9) public Integer costItemId = null;
    @Tag(tag=6) public Integer tenCostItemNum = null;
    @Tag(tag=4) public String gachaPreviewPrefabPath = null;
    @Tag(tag=1819) public Integer wishProgress = null;
    @Tag(tag=736) public String titleTextmap = null;
    @Tag(tag=1854) public String gachaRecordUrlOversea = null;
    @Tag(tag=7) public Integer gachaSortId = null;
    @Tag(tag=12) public String gachaRecordUrl = null;
}
