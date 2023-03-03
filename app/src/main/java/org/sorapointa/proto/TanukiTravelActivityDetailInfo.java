package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TanukiTravelLevelData.*;
import org.sorapointa.proto.TanukiTravelLevelData;

public class TanukiTravelActivityDetailInfo {
    @Tag(tag=4) public List<TanukiTravelLevelData> tanukiTravelLevelDataList = new ArrayList<>();
    @Tag(tag=11) public Boolean isContentClosed = null;
    @Tag(tag=10) public Integer finishedLevelIndex = null;
}
