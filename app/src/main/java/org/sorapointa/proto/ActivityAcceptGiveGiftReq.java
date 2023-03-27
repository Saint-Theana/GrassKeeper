package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityAcceptGiveGiftReq {
    public enum ActivityAcceptGiveGiftReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8679) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public Integer scheduleId = null;
    @Tag(tag=7) public Integer uid = null;
}
