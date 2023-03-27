package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityMixinRecoverInfo {
    @Tag(tag=1) public Integer instancedAbilityId = null;
    @Tag(tag=2) public Integer instancedModifierId = null;
    @Tag(tag=3) public Integer localId = null;
    @Tag(tag=4) public List<Integer> dataList = new ArrayList<>();
    @Tag(tag=5) public Boolean isServerbuffModifier = null;
    @Tag(tag=6) public List<MassivePropSyncInfo> massivePropList = new ArrayList<>();
    @Tag(tag=7) public BreakoutSnapShot breakoutSnapShot = null;
}
