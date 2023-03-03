package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BattlePassRewardTag.*;
import org.sorapointa.proto.BattlePassRewardTag;

public class BattlePassRewardTakeOption {
    @Tag(tag=10) public BattlePassRewardTag tag = null;
    @Tag(tag=14) public Integer optionIdx = null;
}
