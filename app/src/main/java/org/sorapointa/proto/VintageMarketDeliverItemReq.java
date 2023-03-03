package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class VintageMarketDeliverItemReq {
    @Tag(tag=3) public List<ItemParam> deliverItemList = new ArrayList<>();
    @Tag(tag=5) public Integer traderId = null;
}
