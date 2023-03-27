package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintageMarketDividendFinishNotify {
    public enum DPMDPPBODPD {
        @Tag(tag=0) None ,
        @Tag(tag=20769) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public Integer coinA = null;
    @Tag(tag=3) public Integer coinC = null;
}
