package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityAcceptGiveGiftRsp {
    public enum ActivityAcceptGiveGiftRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8235) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Integer scheduleId = null;
    @Tag(tag=9) public ActivityAcceptGiftResultInfo acceptGiftResultInfo = null;
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
}
