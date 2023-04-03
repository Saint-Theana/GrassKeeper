package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ExhibitionDisplayInfo.*;
import org.sorapointa.proto.ExhibitionDisplayInfo;
import org.sorapointa.proto.LanV3BoatSettleInfo.*;
import org.sorapointa.proto.LanV3BoatSettleInfo;

public class LanV3BoatSettleNotify {
    public enum BMIDNGEDLLF {
        @Tag(tag=0) None ,
        @Tag(tag=6566) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public List<ExhibitionDisplayInfo> scoreList = new ArrayList<>();
    @Tag(tag=10) public Integer duration = null;
    @Tag(tag=11) public Integer beginTime = null;
    @Tag(tag=5) public Integer stageType = null;
    @Tag(tag=9) public List<Integer> winnerUidList = new ArrayList<>();
    @Tag(tag=12) public Integer playIndex = null;
    @Tag(tag=13) public Boolean isSingle = null;
    @Tag(tag=7) public List<LanV3BoatSettleInfo> settleInfoList = new ArrayList<>();
    @Tag(tag=3) public Boolean isGallerySucc = null;
}
