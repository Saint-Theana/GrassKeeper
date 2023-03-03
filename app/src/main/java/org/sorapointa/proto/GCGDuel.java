package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGCard.*;
import org.sorapointa.proto.GCGCard;
import org.sorapointa.proto.GCGControllerShowInfo.*;
import org.sorapointa.proto.GCGControllerShowInfo;
import org.sorapointa.proto.GCGCostReviseInfo.*;
import org.sorapointa.proto.GCGCostReviseInfo;
import org.sorapointa.proto.GCGDuelChallenge.*;
import org.sorapointa.proto.GCGDuelChallenge;
import org.sorapointa.proto.GCGGameBusinessType.*;
import org.sorapointa.proto.GCGGameBusinessType;
import org.sorapointa.proto.GCGPVEIntention.*;
import org.sorapointa.proto.GCGPVEIntention;
import org.sorapointa.proto.GCGPhase.*;
import org.sorapointa.proto.GCGPhase;
import org.sorapointa.proto.GCGPlayerField.*;
import org.sorapointa.proto.GCGPlayerField;

public class GCGDuel {
    @Tag(tag=3) public Integer serverSeq = null;
    @Tag(tag=7) public List<GCGPlayerField> fieldList = new ArrayList<>();
    @Tag(tag=14) public Integer businessType = null;
    @Tag(tag=5) public List<GCGDuelChallenge> challengeList = new ArrayList<>();
    @Tag(tag=11) public Integer gameId = null;
    @Tag(tag=13) public Integer controllerId = null;
    @Tag(tag=15) public Integer round = null;
    @Tag(tag=12) public Integer curControllerId = null;
    @Tag(tag=1) public List<GCGPVEIntention> intentionList = new ArrayList<>();
    @Tag(tag=10) public GCGCostReviseInfo costRevise = null;
    @Tag(tag=4) public List<Integer> cardIdList = new ArrayList<>();
    @Tag(tag=9) public List<GCGCard> cardList = new ArrayList<>();
    @Tag(tag=6) public List<GCGControllerShowInfo> showInfoList = new ArrayList<>();
    @Tag(tag=2) public Integer gameType = null;
    @Tag(tag=8) public GCGPhase phase = null;
}
