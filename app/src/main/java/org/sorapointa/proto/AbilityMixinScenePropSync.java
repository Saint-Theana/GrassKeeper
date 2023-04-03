package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MassivePropSyncInfo.*;
import org.sorapointa.proto.MassivePropSyncInfo;

public class AbilityMixinScenePropSync {
    @Tag(tag=2) public Boolean isClearAll = null;
    @Tag(tag=11) public List<MassivePropSyncInfo> massivePropList = new ArrayList<>();
    @Tag(tag=10,isSigned=true) public List<Long> deleteIdList = new ArrayList<>();
}
