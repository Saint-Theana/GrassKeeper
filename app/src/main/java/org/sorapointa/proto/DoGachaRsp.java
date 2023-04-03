package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GachaItem.*;
import org.sorapointa.proto.GachaItem;

public class DoGachaRsp {
    public enum DoGachaRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1598) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer gachaTimesLimit = null;
    @Tag(tag=9) public Integer newGachaRandom = null;
    @Tag(tag=13) public Integer gachaType = null;
    @Tag(tag=4) public Integer leftGachaTimes = null;
    @Tag(tag=8) public Integer costItemNum = null;
    @Tag(tag=3) public List<GachaItem> gachaItemList = new ArrayList<>();
    @Tag(tag=12) public Integer wishProgress = null;
    @Tag(tag=112) public Integer dailyGachaTimes = null;
    @Tag(tag=5) public Integer costItemId = null;
    @Tag(tag=10) public Integer wishItemId = null;
    @Tag(tag=475) public Integer curScheduleDailyGachaTimes = null;
    @Tag(tag=11) public Integer tenCostItemNum = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=15) public Integer gachaTimes = null;
    @Tag(tag=1849) public Boolean isUnderMinorsRestrict = null;
    @Tag(tag=397) public Boolean isUnderGeneralRestrict = null;
    @Tag(tag=2) public Integer gachaScheduleId = null;
    @Tag(tag=1) public Integer wishMaxProgress = null;
    @Tag(tag=6) public Integer tenCostItemId = null;
}
