package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LanV3RaceSettleNotify {
    public enum PCKFCBDIILI {
        @Tag(tag=0) None ,
        @Tag(tag=23477) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public Boolean isNewRecord = null;
    @Tag(tag=8) public Integer score = null;
    @Tag(tag=9) public Integer galleryId = null;
    @Tag(tag=15) public Integer totalCointCount = null;
    @Tag(tag=7) public Boolean isSuccess = null;
    @Tag(tag=14) public Integer levelId = null;
    @Tag(tag=11) public Integer coinCount = null;
    @Tag(tag=5) public Integer remainTime = null;
}
