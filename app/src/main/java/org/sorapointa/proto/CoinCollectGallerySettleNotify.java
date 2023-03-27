package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CoinCollectGallerySettleNotify {
    public enum LBHFNLLPEKD {
        @Tag(tag=0) None ,
        @Tag(tag=5542) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Integer coinTotalNum = null;
    @Tag(tag=8) public Boolean isNewRecord = null;
    @Tag(tag=15) public Integer coinCollectTime = null;
    @Tag(tag=10) public Integer multistagePlayIndex = null;
    @Tag(tag=1) public Integer levelId = null;
    @Tag(tag=14) public Integer coinCollectNum = null;
}
