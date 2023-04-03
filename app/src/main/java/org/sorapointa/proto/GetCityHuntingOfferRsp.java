package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HuntingPair.*;
import org.sorapointa.proto.HuntingPair;
import org.sorapointa.proto.HuntingOfferData.*;
import org.sorapointa.proto.HuntingOfferData;

public class GetCityHuntingOfferRsp {
    public enum GetCityHuntingOfferRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4341) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public Integer nextRefreshTime = null;
    @Tag(tag=14) public Integer curWeekFinishedCount = null;
    @Tag(tag=7) public HuntingPair ongoingHuntingPair = null;
    @Tag(tag=11) public List<HuntingOfferData> huntingOfferList = new ArrayList<>();
    @Tag(tag=9) public Integer cityId = null;
}
