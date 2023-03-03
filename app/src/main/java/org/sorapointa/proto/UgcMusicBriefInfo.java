package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UgcMusicBriefInfo {
    @Tag(tag=5) public Long importFromUgcGuid = null;
    @Tag(tag=8) public Boolean isPublished = null;
    @Tag(tag=1) public Boolean isPlayed = null;
    @Tag(tag=2) public Integer musicId = null;
    @Tag(tag=1182) public Integer savePageType = null;
    @Tag(tag=12) public Integer saveIdx = null;
    @Tag(tag=10) public String creatorNickname = null;
    @Tag(tag=15) public Integer version = null;
    @Tag(tag=3) public Integer saveTime = null;
    @Tag(tag=1002) public List<Integer> afterNoteList = new ArrayList<>();
    @Tag(tag=982) public List<Integer> beforeNoteList = new ArrayList<>();
    @Tag(tag=9) public Boolean isPsnPlatform = null;
    @Tag(tag=1822) public Integer timeLineEditTime = null;
    @Tag(tag=11) public Boolean isChangedAfterPublish = null;
    @Tag(tag=13) public Integer publishTime = null;
    @Tag(tag=14) public Integer maxScore = null;
    @Tag(tag=576) public Integer realTimeEditTime = null;
    @Tag(tag=7) public Integer noteCount = null;
    @Tag(tag=4) public Long ugcGuid = null;
    @Tag(tag=6) public Integer selfMaxScore = null;
}
