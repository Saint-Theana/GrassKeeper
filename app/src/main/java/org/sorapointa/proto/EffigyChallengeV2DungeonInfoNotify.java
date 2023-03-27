package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EffigyChallengeV2DungeonInfoNotify {
    public enum MKHAEAENIHE {
        @Tag(tag=0) None ,
        @Tag(tag=20626) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Integer levelId = null;
    @Tag(tag=4) public Integer challengeModeDifficulty = null;
    @Tag(tag=10) public Integer skillNo = null;
}
