package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GachaItem.*;
import org.sorapointa.proto.GachaItem;

public class DoGachaRsp {
    @Tag(tag=155) public Integer curScheduleDailyGachaTimes = null;
    @Tag(tag=10) public Integer costItemNum = null;
    @Tag(tag=9) public Integer wishMaxProgress = null;
    @Tag(tag=8) public Integer wishItemId = null;
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public Integer tenCostItemNum = null;
    @Tag(tag=2) public Integer wishProgress = null;
    @Tag(tag=15) public List<GachaItem> gachaItemList = new ArrayList<>();
    @Tag(tag=7) public Integer tenCostItemId = null;
    @Tag(tag=4) public Integer gachaTimes = null;
    @Tag(tag=1435) public Boolean isUnderMinorsRestrict = null;
    @Tag(tag=1868) public Boolean isUnderGeneralRestrict = null;
    @Tag(tag=12) public Integer gachaType = null;
    @Tag(tag=1) public Integer gachaTimesLimit = null;
    @Tag(tag=14) public Integer costItemId = null;
    @Tag(tag=1240) public Integer dailyGachaTimes = null;
    @Tag(tag=6) public Integer leftGachaTimes = null;
    @Tag(tag=11) public Integer newGachaRandom = null;
    @Tag(tag=5) public Integer gachaScheduleId = null;
}
