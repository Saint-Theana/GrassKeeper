package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WindFieldGalleryChallengeInfoNotify {
    public enum AJDPFIHEEGF {
        @Tag(tag=0) None ,
        @Tag(tag=5522) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Integer challengeTimestamp = null;
    @Tag(tag=9) public Integer showId = null;
    @Tag(tag=13) public Integer challengeBallCurCount = null;
    @Tag(tag=12) public Boolean isSuccess = null;
    @Tag(tag=10) public Boolean isStart = null;
    @Tag(tag=5) public Integer challengeBallMaxCount = null;
    @Tag(tag=3) public Integer challengeTotalTime = null;
}
