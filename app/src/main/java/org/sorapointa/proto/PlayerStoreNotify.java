package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Item.*;
import org.sorapointa.proto.Item;
import org.sorapointa.proto.StoreType.*;
import org.sorapointa.proto.StoreType;

public class PlayerStoreNotify {
    @Tag(tag=15) public List<Item> itemList = new ArrayList<>();
    @Tag(tag=8) public Integer weightLimit = null;
    @Tag(tag=2) public Integer storeType = null;
}
