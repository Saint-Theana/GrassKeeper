package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SummerTimeSprintBoatRestartRsp {
    public enum SummerTimeSprintBoatRestartRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8585) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public Integer groupId = null;
    @Tag(tag=15) public Integer scheduleId = null;
}
