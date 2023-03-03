package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SeaLampSectionInfo.*;
import org.sorapointa.proto.SeaLampSectionInfo;

public class SeaLampActivityInfo {
    @Tag(tag=14) public Boolean isMechanicusOpen = null;
    @Tag(tag=1) public Integer dayIndex = null;
    @Tag(tag=6) public List<SeaLampSectionInfo> sectionInfoList = new ArrayList<>();
    @Tag(tag=10) public Integer popularity = null;
    @Tag(tag=15) public Integer seaLampCoin = null;
    @Tag(tag=11) public Integer firstDayStartTime = null;
    @Tag(tag=9) public Integer mechanicusId = null;
    @Tag(tag=12) public Boolean isMechanicusFeatureClose = null;
    @Tag(tag=5) public Boolean isContentClosed = null;
}
