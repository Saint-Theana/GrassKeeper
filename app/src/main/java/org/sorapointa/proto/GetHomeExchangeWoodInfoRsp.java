package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetHomeExchangeWoodInfoRsp {
    public static class HomeExchangeWoodInfo {
        @Tag(tag=7) public Integer exchangeLimit = null;
        @Tag(tag=12) public Integer exchangedCount = null;
        @Tag(tag=14,isFixed=true) public Integer nextRefreshTime = null;
        @Tag(tag=2) public Integer woodId = null;
    }

    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public List<HomeExchangeWoodInfo> woodInfoList = new ArrayList<>();
}
