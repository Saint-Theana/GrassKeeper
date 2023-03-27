package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDebugReplayNotify {
    public enum MHKMBENLMDA {
        @Tag(tag=0) None ,
        @Tag(tag=7443) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public String jsonStr = null;
}
