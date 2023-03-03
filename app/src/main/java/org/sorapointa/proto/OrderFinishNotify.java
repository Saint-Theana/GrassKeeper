package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class OrderFinishNotify {
    @Tag(tag=3) public Integer orderId = null;
    @Tag(tag=15) public Integer cardProductRemainDays = null;
    @Tag(tag=9) public List<ItemParam> itemList = new ArrayList<>();
    @Tag(tag=7) public Integer addMcoin = null;
    @Tag(tag=6) public String productId = null;
}
