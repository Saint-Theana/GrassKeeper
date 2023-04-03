package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WorldRoutineTypeInfo.*;
import org.sorapointa.proto.WorldRoutineTypeInfo;

public class WorldRoutineTypeRefreshNotify {
    public enum WorldRoutineTypeRefreshNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3546) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public WorldRoutineTypeInfo worldRoutineType = null;
}
