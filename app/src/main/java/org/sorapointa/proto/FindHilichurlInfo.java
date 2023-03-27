package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FindHilichurlInfo {
    @Tag(tag=1) public Integer dayIndex = null;
    @Tag(tag=14) public Boolean isEndQuestAccept = null;
    @Tag(tag=8) public Integer contentCloseTime = null;
    @Tag(tag=15) public Boolean isContentClosed = null;
    @Tag(tag=2) public List<FindHilichurlDayContentInfo> dayContentInfoList = new ArrayList<>();
    @Tag(tag=4) public Integer minOpenPlayerLevel = null;
    @Tag(tag=10) public Integer playerDayIndex = null;
}
