package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Item.*;
import org.sorapointa.proto.Item;
import org.sorapointa.proto.StoreType.*;
import org.sorapointa.proto.StoreType;

public class StoreItemChangeNotify {
    @Tag(tag=12) public Integer storeType = null;
    @Tag(tag=10) public List<Item> itemList = new ArrayList<>();
}
