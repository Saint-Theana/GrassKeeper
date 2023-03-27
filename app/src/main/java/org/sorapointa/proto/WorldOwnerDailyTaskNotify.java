package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WorldOwnerDailyTaskNotify {
    public enum WorldOwnerDailyTaskNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=163) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=4) public Integer finishedDailyTaskNum = null;
    @Tag(tag=9) public List<DailyTaskInfo> taskList = new ArrayList<>();
    @Tag(tag=15) public Integer filterCityId = null;
}
