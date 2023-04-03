package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class VintageMarketTraderInfo {
    @Tag(tag=10) public List<ItemParam> availableItemList = new ArrayList<>();
    @Tag(tag=6) public Integer traderId = null;
}
