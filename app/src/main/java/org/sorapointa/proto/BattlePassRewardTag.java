package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BattlePassUnlockStatus.*;
import org.sorapointa.proto.BattlePassUnlockStatus;

public class BattlePassRewardTag {
    @Tag(tag=4) public Integer level = null;
    @Tag(tag=2) public Integer unlockStatus = null;
    @Tag(tag=7) public Integer rewardId = null;
}
