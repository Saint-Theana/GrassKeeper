package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class BartenderCompleteOrderReq {
    @Tag(tag=14) public Integer cupType = null;
    @Tag(tag=7) public Integer qteCount = null;
    @Tag(tag=11) public Integer questId = null;
    @Tag(tag=10) public List<ItemParam> itemList = new ArrayList<>();
    @Tag(tag=9) public Boolean isViewFormula = null;
    @Tag(tag=6) public List<Integer> optionalOrderList = new ArrayList<>();
    @Tag(tag=3) public Integer retryCount = null;
}
