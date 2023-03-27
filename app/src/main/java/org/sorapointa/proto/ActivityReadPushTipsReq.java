package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityReadPushTipsReq {
    public enum ActivityReadPushTipsReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8896) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=11) public List<Integer> activityPushTipsIdList = new ArrayList<>();
    @Tag(tag=14) public Integer activityId = null;
}
