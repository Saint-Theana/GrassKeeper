package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TanukiTravelActivityInfo {
    @Tag(tag=11) public Integer finishedLevelIndex = null;
    @Tag(tag=2) public Boolean isContentClosed = null;
    @Tag(tag=6) public List<TanukiTravelLevelData> tanukiTravelLevelDataList = new ArrayList<>();
}
