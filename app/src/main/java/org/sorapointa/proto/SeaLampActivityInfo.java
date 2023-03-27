package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SeaLampActivityInfo {
    @Tag(tag=1) public Boolean isContentClosed = null;
    @Tag(tag=3) public Boolean isMechanicusOpen = null;
    @Tag(tag=2) public List<SeaLampSectionInfo> sectionInfoList = new ArrayList<>();
    @Tag(tag=10) public Integer firstDayStartTime = null;
    @Tag(tag=5) public Integer popularity = null;
    @Tag(tag=14) public Boolean isMechanicusFeatureClose = null;
    @Tag(tag=4) public Integer dayIndex = null;
    @Tag(tag=12) public Integer mechanicusId = null;
    @Tag(tag=6) public Integer seaLampCoin = null;
}
