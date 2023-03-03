package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FindHilichurlDayContentInfo.*;
import org.sorapointa.proto.FindHilichurlDayContentInfo;

public class FindHilichurlDetailInfo {
    @Tag(tag=1) public List<FindHilichurlDayContentInfo> dayContentInfoList = new ArrayList<>();
    @Tag(tag=12) public Integer minOpenPlayerLevel = null;
    @Tag(tag=7) public Boolean isEndQuestAccept = null;
    @Tag(tag=6) public Integer contentCloseTime = null;
    @Tag(tag=9) public Boolean isContentClosed = null;
    @Tag(tag=4) public Integer playerDayIndex = null;
    @Tag(tag=15) public Integer dayIndex = null;
}
