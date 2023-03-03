package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.StoreType.*;
import org.sorapointa.proto.StoreType;

public class StoreWeightLimitNotify {
    @Tag(tag=2) public Integer weaponCountLimit = null;
    @Tag(tag=7) public Integer storeType = null;
    @Tag(tag=4) public Integer materialCountLimit = null;
    @Tag(tag=6) public Integer reliquaryCountLimit = null;
    @Tag(tag=9) public Integer furnitureCountLimit = null;
    @Tag(tag=15) public Integer weightLimit = null;
}
