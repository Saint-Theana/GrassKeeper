package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintageMarketStoreUnlockSlotRsp {
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public Integer slotCount = null;
    @Tag(tag=10) public Integer storeId = null;
}
