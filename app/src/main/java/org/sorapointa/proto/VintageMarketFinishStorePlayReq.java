package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.VintageMarketStoreOpInfo.*;
import org.sorapointa.proto.VintageMarketStoreOpInfo;

public class VintageMarketFinishStorePlayReq {
    public enum DBOLEHNGBHM {
        @Tag(tag=0) None ,
        @Tag(tag=23780) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public Integer storeRound = null;
    @Tag(tag=12) public List<VintageMarketStoreOpInfo> storeOpList = new ArrayList<>();
}
