package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FleurFairChapterInfo.*;
import org.sorapointa.proto.FleurFairChapterInfo;
import org.sorapointa.proto.FleurFairDungeonSectionInfo.*;
import org.sorapointa.proto.FleurFairDungeonSectionInfo;
import org.sorapointa.proto.FleurFairMinigameInfo.*;
import org.sorapointa.proto.FleurFairMinigameInfo;

public class FleurFairActivityDetailInfo {
    public static class MapMinigameInfoMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public FleurFairMinigameInfo value = null;
    }

    public static class MapDungeonSectionInfoMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public FleurFairDungeonSectionInfo value = null;
    }

    @Tag(tag=4) public Boolean isContentClosed = null;
    @Tag(tag=6) public Integer dungeonPunishOverTime = null;
    @Tag(tag=15) public Integer contentCloseTime = null;
    @Tag(tag=13) public Integer obtainedToken = null;
    @Tag(tag=14) public List<FleurFairChapterInfo> chapterInfoList = new ArrayList<>();
    @Tag(tag=9) public List<MapMinigameInfoMap> minigameInfoMap = new ArrayList<>();
    @Tag(tag=3) public List<MapDungeonSectionInfoMap> dungeonSectionInfoMap = new ArrayList<>();
    @Tag(tag=11) public Boolean isDungeonUnlocked = null;
}
