package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CityReputationRequestInfo {
    public static class CityReputationRequestInfo_RequestInfo {
        @Tag(tag=11) public Integer requestId = null;
        @Tag(tag=14) public Integer questId = null;
        @Tag(tag=13) public Boolean isTakenReward = null;
    }

    @Tag(tag=1) public Boolean isOpen = null;
    @Tag(tag=2) public List<CityReputationRequestInfo_RequestInfo> requestInfoList = new ArrayList<>();
}
