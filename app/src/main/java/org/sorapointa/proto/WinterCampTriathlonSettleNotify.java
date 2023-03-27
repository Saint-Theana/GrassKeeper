package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WinterCampTriathlonSettleNotify {
    public enum WinterCampTriathlonSettleNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8723) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Integer normalCoin = null;
    @Tag(tag=6) public Boolean isSuccess = null;
    @Tag(tag=8) public Integer limitedCoin = null;
    @Tag(tag=2) public Boolean isNewRecord = null;
    @Tag(tag=13) public Integer galleryId = null;
    @Tag(tag=4) public Integer raceId = null;
    @Tag(tag=7) public Integer remainTime = null;
    @Tag(tag=1) public Integer score = null;
}
