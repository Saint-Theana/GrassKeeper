package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.InstableSprayStageInfo.*;
import org.sorapointa.proto.InstableSprayStageInfo;

public class InstableSprayDetailInfo {
    @Tag(tag=9) public List<InstableSprayStageInfo> stageInfoList = new ArrayList<>();
}
