package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HitTreeInfo.*;
import org.sorapointa.proto.HitTreeInfo;

public class WidgetQuickHitTreeReq {
    @Tag(tag=5) public List<HitTreeInfo> hitTreeInfoList = new ArrayList<>();
}
