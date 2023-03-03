package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetCityReputationMapInfoRsp {
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public Boolean isNewHunting = null;
    @Tag(tag=2) public Boolean isNewRequest = null;
    @Tag(tag=9) public List<Integer> unlockHuntingCityList = new ArrayList<>();
    @Tag(tag=3) public List<Integer> rewardCityList = new ArrayList<>();
}
