package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityGetRecvGiftListRsp {
    public enum ActivityGetRecvGiftListRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8705) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public List<ActivityRecvGiftData> recvGiftList = new ArrayList<>();
    @Tag(tag=10) public Integer scheduleId = null;
}
