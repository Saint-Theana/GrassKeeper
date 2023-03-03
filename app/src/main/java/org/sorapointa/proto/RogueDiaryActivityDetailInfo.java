package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RogueDiaryProgress.*;
import org.sorapointa.proto.RogueDiaryProgress;
import org.sorapointa.proto.RogueDiaryStageInfo.*;
import org.sorapointa.proto.RogueDiaryStageInfo;

public class RogueDiaryActivityDetailInfo {
    @Tag(tag=11) public List<RogueDiaryStageInfo> stageList = new ArrayList<>();
    @Tag(tag=10) public Boolean isHaveProgress = null;
    @Tag(tag=2) public Boolean isContentClosed = null;
    @Tag(tag=7) public RogueDiaryProgress curProgress = null;
}
