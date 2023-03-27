package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeExchangeWoodReq {
    public static class MapMaterialCountMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum NIIPNNDOJGL {
        @Tag(tag=0) None ,
        @Tag(tag=4672) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1) public List<MapMaterialCountMap> materialCountMap = new ArrayList<>();
    @Tag(tag=8) public Integer woodId = null;
}
