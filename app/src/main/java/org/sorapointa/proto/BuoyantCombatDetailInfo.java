package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BuoyantCombatDailyInfo.*;
import org.sorapointa.proto.BuoyantCombatDailyInfo;

public class BuoyantCombatDetailInfo {
    @Tag(tag=8) public List<BuoyantCombatDailyInfo> dailyInfoList = new ArrayList<>();
}
