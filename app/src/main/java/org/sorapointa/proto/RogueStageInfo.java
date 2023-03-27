package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RogueStageInfo {
    @Tag(tag=8) public Integer cachedCoinBNum = null;
    @Tag(tag=3) public List<RoguelikeRuneRecord> runeRecordList = new ArrayList<>();
    @Tag(tag=4) public Integer maxPassedLevel = null;
    @Tag(tag=14) public Integer coinCNum = null;
    @Tag(tag=15) public Integer exploreCellNum = null;
    @Tag(tag=520) public Integer reviseMonsterLevel = null;
    @Tag(tag=10) public RogueShowAvatarTeamInfo avatarTeam = null;
    @Tag(tag=1765) public Integer cachedCoinCNum = null;
    @Tag(tag=12) public Boolean isExplored = null;
    @Tag(tag=9) public Boolean isPassed = null;
    @Tag(tag=2) public Boolean isInCombat = null;
    @Tag(tag=7) public Boolean isTakenReward = null;
    @Tag(tag=13) public Integer stageId = null;
    @Tag(tag=6) public Integer curLevel = null;
    @Tag(tag=11) public Boolean isOpen = null;
}
