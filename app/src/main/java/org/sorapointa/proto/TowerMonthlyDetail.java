package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TowerMonthlyBrief.*;
import org.sorapointa.proto.TowerMonthlyBrief;
import org.sorapointa.proto.TowerMonthlyCombatRecord.*;
import org.sorapointa.proto.TowerMonthlyCombatRecord;

public class TowerMonthlyDetail {
    @Tag(tag=2) public TowerMonthlyCombatRecord monthlyCombatRecord = null;
    @Tag(tag=12) public TowerMonthlyBrief monthlyBrief = null;
}
