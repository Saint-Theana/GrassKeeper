package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WorldRoutineInfo.*;
import org.sorapointa.proto.WorldRoutineInfo;

public class WorldRoutineChangeNotify {
    public enum WorldRoutineChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3541) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public Integer routineType = null;
    @Tag(tag=2) public WorldRoutineInfo routineInfo = null;
}
