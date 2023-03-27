package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGCostReviseInfo {
    @Tag(tag=2) public Boolean isCanAttack = null;
    @Tag(tag=5) public List<GCGSelectOnStageCostInfo> selectOnStageCostList = new ArrayList<>();
    @Tag(tag=8) public List<GCGAttackCostInfo> attackCostList = new ArrayList<>();
    @Tag(tag=7) public List<Integer> canUseHandCardIdList = new ArrayList<>();
    @Tag(tag=15) public List<GCGPlayCardCostInfo> playCardCostList = new ArrayList<>();
}
