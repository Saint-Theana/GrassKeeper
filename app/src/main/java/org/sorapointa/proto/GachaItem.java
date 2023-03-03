package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GachaTransferItem.*;
import org.sorapointa.proto.GachaTransferItem;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class GachaItem {
    @Tag(tag=7) public ItemParam gachaItem = null;
    @Tag(tag=6) public Boolean isGachaItemNew = null;
    @Tag(tag=8) public Boolean isFlashCard = null;
    @Tag(tag=9) public List<ItemParam> tokenItemList = new ArrayList<>();
    @Tag(tag=12) public List<GachaTransferItem> transferItems = new ArrayList<>();
}
