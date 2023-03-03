package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.VintageMarketStoreOpInfo.*;
import org.sorapointa.proto.VintageMarketStoreOpInfo;

public class VintageMarketFinishStorePlayReq {
    @Tag(tag=9) public Integer storeRound = null;
    @Tag(tag=3) public List<VintageMarketStoreOpInfo> storeOpList = new ArrayList<>();
}
