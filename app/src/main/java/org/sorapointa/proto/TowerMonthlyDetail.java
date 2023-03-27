package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TowerMonthlyDetail {
    @Tag(tag=5) public TowerMonthlyBrief monthlyBrief = null;
    @Tag(tag=1) public TowerMonthlyCombatRecord monthlyCombatRecord = null;
}
