package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGTCTavernChallengeData.*;
import org.sorapointa.proto.GCGTCTavernChallengeData;

public class GCGTCTavernChallengeUpdateNotify {
    public enum BOGLAPKFCMG {
        @Tag(tag=0) None ,
        @Tag(tag=7570) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public GCGTCTavernChallengeData tavernChallenge = null;
}
