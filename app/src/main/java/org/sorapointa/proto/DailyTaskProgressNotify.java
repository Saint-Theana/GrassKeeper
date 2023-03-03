package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DailyTaskInfo.*;
import org.sorapointa.proto.DailyTaskInfo;

public class DailyTaskProgressNotify {
    @Tag(tag=12) public DailyTaskInfo info = null;
}
