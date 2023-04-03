package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class ScenePlayBattleSettleRewardInfo {
    @Tag(tag=8) public Integer uid = null;
    @Tag(tag=5) public List<ItemParam> rewardItemList = new ArrayList<>();
}
