package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FleurFairMusicGameSettleReq {
    public enum FleurFairMusicGameSettleReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2072) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=3) public Integer combo = null;
    @Tag(tag=9) public Integer musicBasicId = null;
    @Tag(tag=7) public Integer score = null;
    @Tag(tag=6) public Integer correctHit = null;
}
