package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MoonfinTrialLevelInfo.*;
import org.sorapointa.proto.MoonfinTrialLevelInfo;

public class MoonfinTrialActivityDetailInfo {
    public static class MapLevelInfoMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public MoonfinTrialLevelInfo value = null;
    }

    @Tag(tag=5) public List<MapLevelInfoMap> levelInfoMap = new ArrayList<>();
    @Tag(tag=11) public Integer specialFishCount = null;
}
