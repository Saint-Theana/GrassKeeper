package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TowerMonthlyBrief.*;
import org.sorapointa.proto.TowerMonthlyBrief;
import org.sorapointa.proto.TowerMonthlyCombatRecord.*;
import org.sorapointa.proto.TowerMonthlyCombatRecord;

public class TowerMonthlyDetail {
    @Tag(tag=5) public TowerMonthlyBrief monthlyBrief = null;
    @Tag(tag=1) public TowerMonthlyCombatRecord monthlyCombatRecord = null;
}
