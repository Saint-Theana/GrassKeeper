package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RogueDiaryProgress.*;
import org.sorapointa.proto.RogueDiaryProgress;
import org.sorapointa.proto.RogueDiaryStageInfo.*;
import org.sorapointa.proto.RogueDiaryStageInfo;

public class RogueDiaryInfo {
    @Tag(tag=5) public RogueDiaryProgress curProgress = null;
    @Tag(tag=8) public List<RogueDiaryStageInfo> stageList = new ArrayList<>();
    @Tag(tag=1) public Boolean isContentClosed = null;
    @Tag(tag=13) public Boolean isHaveProgress = null;
}
