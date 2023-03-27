package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeAchievementGoalRewardRsp {
    public enum TakeAchievementGoalRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2693) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public List<ItemParam> itemList = new ArrayList<>();
    @Tag(tag=15) public List<Integer> idList = new ArrayList<>();
}
