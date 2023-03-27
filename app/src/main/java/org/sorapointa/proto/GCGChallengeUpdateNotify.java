package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGChallengeUpdateNotify {
    public enum PHDBJKPOOMO {
        @Tag(tag=0) None ,
        @Tag(tag=7731) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public GCGDuelChallenge challenge = null;
    @Tag(tag=9) public Integer serverSeq = null;
}
