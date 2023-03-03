package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FishBattleResult.*;
import org.sorapointa.proto.FishBattleResult;

public class FishBattleEndReq {
    @Tag(tag=3) public Integer maxBonusTime = null;
    @Tag(tag=10) public Integer battleResult = null;
    @Tag(tag=11) public Boolean isAlwaysBonus = null;
}
