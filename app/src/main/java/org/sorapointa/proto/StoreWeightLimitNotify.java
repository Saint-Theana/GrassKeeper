package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class StoreWeightLimitNotify {
    public enum StoreWeightLimitNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=655) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer furnitureCountLimit = null;
    @Tag(tag=3) public Integer materialCountLimit = null;
    @Tag(tag=5) public Integer reliquaryCountLimit = null;
    @Tag(tag=14) public Integer weightLimit = null;
    @Tag(tag=11) public Integer storeType = null;
    @Tag(tag=9) public Integer weaponCountLimit = null;
}
