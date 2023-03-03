package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HuntingOfferData.*;
import org.sorapointa.proto.HuntingOfferData;
import org.sorapointa.proto.HuntingPair.*;
import org.sorapointa.proto.HuntingPair;

public class GetCityHuntingOfferRsp {
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public List<HuntingOfferData> huntingOfferList = new ArrayList<>();
    @Tag(tag=2) public Integer cityId = null;
    @Tag(tag=8) public HuntingPair ongoingHuntingPair = null;
    @Tag(tag=1) public Integer curWeekFinishedCount = null;
    @Tag(tag=4) public Integer nextRefreshTime = null;
}
