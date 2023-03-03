package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.StoreType.*;
import org.sorapointa.proto.StoreType;

public class StoreItemDelNotify {
    @Tag(tag=12) public List<Long> guidList = new ArrayList<>();
    @Tag(tag=15) public Integer storeType = null;
}
