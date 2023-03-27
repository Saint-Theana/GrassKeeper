package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGTCTavernChallengeDataNotify {
    public enum POPILOEOCIK {
        @Tag(tag=0) None ,
        @Tag(tag=7722) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public List<GCGTCTavernChallengeData> tavernChallengeList = new ArrayList<>();
}
