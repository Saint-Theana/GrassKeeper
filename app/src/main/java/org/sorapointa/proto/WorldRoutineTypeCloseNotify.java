package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WorldRoutineTypeCloseNotify {
    public enum WorldRoutineTypeCloseNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3519) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer routineType = null;
}
