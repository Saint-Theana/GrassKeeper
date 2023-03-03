package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BattlePassRewardTakeOption.*;
import org.sorapointa.proto.BattlePassRewardTakeOption;

public class TakeBattlePassRewardReq {
    @Tag(tag=12) public List<BattlePassRewardTakeOption> takeOptionList = new ArrayList<>();
}
