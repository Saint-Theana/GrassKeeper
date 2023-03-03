package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TaskVar.*;
import org.sorapointa.proto.TaskVar;

public class TaskVarNotify {
    @Tag(tag=7) public List<TaskVar> taskVarList = new ArrayList<>();
}
