package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetCityReputationMapInfoRsp {
    public enum GetCityReputationMapInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2878) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Boolean isNewRequest = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
    @Tag(tag=12) public List<Integer> unlockHuntingCityList = new ArrayList<>();
    @Tag(tag=7) public Boolean isNewHunting = null;
    @Tag(tag=1) public List<Integer> rewardCityList = new ArrayList<>();
}
