package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class VintageMarketTraderInfo {
    @Tag(tag=7) public Integer traderId = null;
    @Tag(tag=9) public List<ItemParam> availableItemList = new ArrayList<>();
}
