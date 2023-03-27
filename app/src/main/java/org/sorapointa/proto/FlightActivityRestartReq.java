package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FlightActivityRestartReq {
    public enum FlightActivityRestartReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2017) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=15) public Integer groupId = null;
    @Tag(tag=14) public Integer scheduleId = null;
}
