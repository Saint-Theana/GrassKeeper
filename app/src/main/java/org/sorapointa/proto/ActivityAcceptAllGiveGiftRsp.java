package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityAcceptAllGiveGiftRsp {
    public enum ActivityAcceptAllGiveGiftRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8316) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Integer scheduleId = null;
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public List<ActivityAcceptGiftResultInfo> acceptGiftResultInfoList = new ArrayList<>();
}
