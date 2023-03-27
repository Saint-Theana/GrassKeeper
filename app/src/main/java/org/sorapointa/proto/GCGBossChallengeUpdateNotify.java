package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGBossChallengeUpdateNotify {
    public enum OGCPGBNLNOM {
        @Tag(tag=0) None ,
        @Tag(tag=7119) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public GCGBossChallengeData bossChallenge = null;
}
