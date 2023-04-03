package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DailyTaskInfo.*;
import org.sorapointa.proto.DailyTaskInfo;

public class DailyTaskProgressNotify {
    public enum DailyTaskProgressNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=179) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public DailyTaskInfo info = null;
}
