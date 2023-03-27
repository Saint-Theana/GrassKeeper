package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BuoyantCombatSettleNotify {
    public enum BuoyantCombatSettleNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8267) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public BuoyantCombatSettleInfo settleInfo = null;
    @Tag(tag=15) public Integer galleryId = null;
}
