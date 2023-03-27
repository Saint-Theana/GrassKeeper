package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSDeckUnlockNotify {
    public enum FCEEKKCPDBD {
        @Tag(tag=0) None ,
        @Tag(tag=7096) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Integer deckId = null;
}
