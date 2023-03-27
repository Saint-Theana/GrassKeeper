package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetHomeExchangeWoodInfoRsp {
    public static class HomeExchangeWoodInfo {
        @Tag(tag=8) public Integer exchangeLimit = null;
        @Tag(tag=2) public Integer woodId = null;
        @Tag(tag=3) public Integer nextRefreshTime = null;
        @Tag(tag=9) public Integer exchangedCount = null;
    }

    public enum GGMEHEFODIO {
        @Tag(tag=0) None ,
        @Tag(tag=4757) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public List<HomeExchangeWoodInfo> woodInfoList = new ArrayList<>();
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
}
