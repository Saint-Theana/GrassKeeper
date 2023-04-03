package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WorldRoutineTypeInfo.*;
import org.sorapointa.proto.WorldRoutineTypeInfo;

public class WorldAllRoutineTypeNotify {
    public enum WorldAllRoutineTypeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3545) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public List<WorldRoutineTypeInfo> worldRoutineTypeList = new ArrayList<>();
}
