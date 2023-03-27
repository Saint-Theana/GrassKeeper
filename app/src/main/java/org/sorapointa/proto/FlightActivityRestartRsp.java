package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FlightActivityRestartRsp {
    public enum FlightActivityRestartRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2071) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Integer scheduleId = null;
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=12) public Integer groupId = null;
}
