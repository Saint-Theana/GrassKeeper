package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ItemGivingReq {
    public static class MapItemGuidCountMap {
        @Tag(tag=1) public Long key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum ItemGivingReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=101) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=13) public List<MapItemGuidCountMap> itemGuidCountMap = new ArrayList<>();
    @Tag(tag=7) public Integer givingId = null;
    @Tag(tag=9) public List<ItemParam> itemParamList = new ArrayList<>();
    @Tag(tag=8) public Integer itemGivingType = null;
}
