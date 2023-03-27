package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MusicBriefInfo {
    @Tag(tag=8) public Long ugcGuid = null;
    @Tag(tag=88) public Integer realTimeEditTime = null;
    @Tag(tag=15) public Integer publishTime = null;
    @Tag(tag=1363) public List<Integer> beforeNoteList = new ArrayList<>();
    @Tag(tag=5) public Boolean isPlayed = null;
    @Tag(tag=6) public Long importFromUgcGuid = null;
    @Tag(tag=14) public Integer musicId = null;
    @Tag(tag=1062) public List<Integer> afterNoteList = new ArrayList<>();
    @Tag(tag=1837) public Integer timeLineEditTime = null;
    @Tag(tag=7) public Integer selfMaxScore = null;
    @Tag(tag=287) public Integer savePageType = null;
    @Tag(tag=2) public Integer noteCount = null;
    @Tag(tag=9) public Integer saveIdx = null;
    @Tag(tag=4) public Boolean isChangedAfterPublish = null;
    @Tag(tag=1) public Integer version = null;
    @Tag(tag=3) public String creatorNickname = null;
    @Tag(tag=11) public Boolean isPublished = null;
    @Tag(tag=12) public Integer maxScore = null;
    @Tag(tag=10) public Integer saveTime = null;
    @Tag(tag=13) public Boolean isPsnPlatform = null;
}
