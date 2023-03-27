package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TreasureMapCurrencyNotify {
    public enum TreasureMapCurrencyNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2038) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Integer currencyNum = null;
}
