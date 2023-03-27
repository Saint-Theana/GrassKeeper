package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScenePlayBattleSettleRewardInfo {
    @Tag(tag=8) public Integer uid = null;
    @Tag(tag=5) public List<ItemParam> rewardItemList = new ArrayList<>();
}
