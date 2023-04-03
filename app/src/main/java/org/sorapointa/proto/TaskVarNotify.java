package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TaskVar.*;
import org.sorapointa.proto.TaskVar;

public class TaskVarNotify {
    public enum TaskVarNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=177) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public List<TaskVar> taskVarList = new ArrayList<>();
}
