package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityGiveFriendGiftRsp {
    public enum ActivityGiveFriendGiftRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8707) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public List<Integer> limitGiftList = new ArrayList<>();
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public Integer scheduleId = null;
}
