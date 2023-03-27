package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SummerTimeSprintBoatRestartReq {
    public enum SummerTimeSprintBoatRestartReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8994) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public Integer scheduleId = null;
    @Tag(tag=5) public Integer groupId = null;
}
