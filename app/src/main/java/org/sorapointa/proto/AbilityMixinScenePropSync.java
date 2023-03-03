package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MassivePropSyncInfo.*;
import org.sorapointa.proto.MassivePropSyncInfo;

public class AbilityMixinScenePropSync {
    @Tag(tag=5,isSigned=true) public List<Long> deleteIdList = new ArrayList<>();
    @Tag(tag=12) public Boolean isClearAll = null;
    @Tag(tag=15) public List<MassivePropSyncInfo> massivePropList = new ArrayList<>();
}
