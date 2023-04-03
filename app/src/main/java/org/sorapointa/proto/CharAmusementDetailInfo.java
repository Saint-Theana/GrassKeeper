package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CharAmusementStageData.*;
import org.sorapointa.proto.CharAmusementStageData;

public class CharAmusementDetailInfo {
    @Tag(tag=1) public List<CharAmusementStageData> stageDataList = new ArrayList<>();
}
