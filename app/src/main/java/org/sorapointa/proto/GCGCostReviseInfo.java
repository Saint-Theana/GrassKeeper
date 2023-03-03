package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGAttackCostInfo.*;
import org.sorapointa.proto.GCGAttackCostInfo;
import org.sorapointa.proto.GCGPlayCardCostInfo.*;
import org.sorapointa.proto.GCGPlayCardCostInfo;
import org.sorapointa.proto.GCGSelectOnStageCostInfo.*;
import org.sorapointa.proto.GCGSelectOnStageCostInfo;

public class GCGCostReviseInfo {
    @Tag(tag=4) public Boolean isCanAttack = null;
    @Tag(tag=11) public List<Integer> canUseHandCardIdList = new ArrayList<>();
    @Tag(tag=5) public List<GCGPlayCardCostInfo> playCardCostList = new ArrayList<>();
    @Tag(tag=10) public List<GCGSelectOnStageCostInfo> selectOnStageCostList = new ArrayList<>();
    @Tag(tag=2) public List<GCGAttackCostInfo> attackCostList = new ArrayList<>();
}
