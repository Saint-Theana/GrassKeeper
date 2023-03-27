package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintageMarketNpcEventFinishNotify {
    public enum NLEDGJEHOFD {
        @Tag(tag=0) None ,
        @Tag(tag=21065) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public List<Integer> unlockStrategyList = new ArrayList<>();
    @Tag(tag=12) public Integer coinA = null;
    @Tag(tag=8) public Integer coinC = null;
}
