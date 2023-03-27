package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BattlePassRewardTag {
    @Tag(tag=8) public Integer level = null;
    @Tag(tag=13) public Integer unlockStatus = null;
    @Tag(tag=15) public Integer rewardId = null;
}
