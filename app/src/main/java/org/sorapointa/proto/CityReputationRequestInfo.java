package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CityReputationRequestInfo {
    public static class RequestInfo {
        @Tag(tag=3) public Integer requestId = null;
        @Tag(tag=9) public Integer questId = null;
        @Tag(tag=6) public Boolean isTakenReward = null;
    }

    @Tag(tag=2) public Boolean isOpen = null;
    @Tag(tag=1) public List<RequestInfo> requestInfoList = new ArrayList<>();
}
