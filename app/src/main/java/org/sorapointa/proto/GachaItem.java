package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;
import org.sorapointa.proto.GachaTransferItem.*;
import org.sorapointa.proto.GachaTransferItem;

public class GachaItem {
    @Tag(tag=10) public List<GachaTransferItem> transferItems = new ArrayList<>();
    @Tag(tag=9) public Boolean isGachaItemNew = null;
    @Tag(tag=12) public List<ItemParam> tokenItemList = new ArrayList<>();
    @Tag(tag=4) public ItemParam GachaItem_ = null;
    @Tag(tag=11) public Boolean isFlashCard = null;
}
