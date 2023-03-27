package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerRechargeDataNotify {
    public enum PlayerRechargeDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4119) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Integer cardProductRemainDays = null;
    @Tag(tag=10) public List<ProductPriceTier> productPriceTierList = new ArrayList<>();
}
