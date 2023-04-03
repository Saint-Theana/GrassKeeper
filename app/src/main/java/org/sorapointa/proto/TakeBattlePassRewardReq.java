package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BattlePassRewardTakeOption.*;
import org.sorapointa.proto.BattlePassRewardTakeOption;

public class TakeBattlePassRewardReq {
    public enum TakeBattlePassRewardReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2619) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1) public List<BattlePassRewardTakeOption> takeOptionList = new ArrayList<>();
}
