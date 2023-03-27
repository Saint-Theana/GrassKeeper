package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGGameBriefDataNotify {
    public enum BKKLKPMDKMP {
        @Tag(tag=0) None ,
        @Tag(tag=7654) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public GCGGameBriefData gcgBriefData = null;
    @Tag(tag=12) public Boolean isNewGame = null;
}
