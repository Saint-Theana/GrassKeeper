package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WindFieldGalleryInfoNotify {
    public enum JOCNCDOAALP {
        @Tag(tag=0) None ,
        @Tag(tag=5573) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer elementBallNum = null;
    @Tag(tag=4) public Integer challengeTimestamp = null;
    @Tag(tag=13) public Integer showId = null;
    @Tag(tag=1) public Integer coinNum = null;
    @Tag(tag=5) public Integer challengeBallCurCount = null;
    @Tag(tag=15) public Integer challengeBallMaxCount = null;
    @Tag(tag=11) public Integer challengeTotalTime = null;
    @Tag(tag=3) public Integer killedMonsterNum = null;
}
