package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDuel {
    @Tag(tag=1) public List<GCGCard> cardList = new ArrayList<>();
    @Tag(tag=5) public Integer operationSeq = null;
    @Tag(tag=1985) public List<Integer> forbidFinishChallengeList = new ArrayList<>();
    @Tag(tag=1326) public List<GCGCard> historyCardList = new ArrayList<>();
    @Tag(tag=1636) public List<GCGMessagePack> historyMsgPackList = new ArrayList<>();
    @Tag(tag=14) public Integer curControllerId = null;
    @Tag(tag=10) public List<GCGControllerShowInfo> showInfoList = new ArrayList<>();
    @Tag(tag=1950) public List<JHNLKGDJFCC> cbjidpdhhbh = new ArrayList<>();
    @Tag(tag=15) public List<GCGPVEIntention> intetionList = new ArrayList<>();
    @Tag(tag=6) public GCGCostReviseInfo costRevise = null;
    @Tag(tag=2) public Integer controllerId = null;
    @Tag(tag=3) public List<GCGPlayerField> fieldList = new ArrayList<>();
    @Tag(tag=7) public Integer businessType = null;
    @Tag(tag=8) public GCGPhase phase = null;
    @Tag(tag=37) public List<GCGDuelChallenge> challengeList = new ArrayList<>();
    @Tag(tag=12) public List<Integer> cardIdList = new ArrayList<>();
    @Tag(tag=11) public Integer serverSeq = null;
    @Tag(tag=4) public Integer round = null;
    @Tag(tag=9) public Integer gameId = null;
    @Tag(tag=13) public Integer gameType = null;
}
