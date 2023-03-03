package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MassivePropSyncInfo.*;
import org.sorapointa.proto.MassivePropSyncInfo;

public class AbilityMixinRecoverInfo {
    @Tag(tag=3) public Integer localId = null;
    @Tag(tag=4) public List<Integer> dataList = new ArrayList<>();
    @Tag(tag=5) public Boolean isServerbuffModifier = null;
    @Tag(tag=6) public List<MassivePropSyncInfo> massivePropList = new ArrayList<>();
    @Tag(tag=1) public Integer instancedAbilityId = null;
    @Tag(tag=2) public Integer instancedModifierId = null;
}
