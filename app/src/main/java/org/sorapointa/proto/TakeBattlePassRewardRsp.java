package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BattlePassRewardTakeOption.*;
import org.sorapointa.proto.BattlePassRewardTakeOption;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class TakeBattlePassRewardRsp {
    @Tag(tag=7) public List<ItemParam> itemList = new ArrayList<>();
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public List<BattlePassRewardTakeOption> takeOptionList = new ArrayList<>();
}
