package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ExpeditionChallengeEnterRegionNotify {
    public enum ExpeditionChallengeEnterRegionNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2092) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer id = null;
    @Tag(tag=11) public Boolean isPuzzleFinished = null;
}
