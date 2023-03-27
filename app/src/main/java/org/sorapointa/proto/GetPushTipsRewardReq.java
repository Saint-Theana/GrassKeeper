package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetPushTipsRewardReq {
    public enum GetPushTipsRewardReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2218) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=7) public List<Integer> pushTipsIdList = new ArrayList<>();
}
