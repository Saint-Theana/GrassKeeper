package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class ItemGivingReq {
    public static class MapItemGuidCountMap {
        @Tag(tag=1) public Long key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum ItemGivingType {
        @Tag(tag=0) ITEM_GIVING_TYPE_QUEST ,
        @Tag(tag=1) ITEM_GIVING_TYPE_GADGET ;
    }

    @Tag(tag=15) public List<MapItemGuidCountMap> itemGuidCountMap = new ArrayList<>();
    @Tag(tag=13) public Integer givingId = null;
    @Tag(tag=4) public List<ItemParam> itemParamList = new ArrayList<>();
    @Tag(tag=2) public ItemGivingType itemGivingType = null;
}
