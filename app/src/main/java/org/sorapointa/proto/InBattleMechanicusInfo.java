package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.InBattleMechanicusCardInfo.*;
import org.sorapointa.proto.InBattleMechanicusCardInfo;
import org.sorapointa.proto.InBattleMechanicusMonsterInfo.*;
import org.sorapointa.proto.InBattleMechanicusMonsterInfo;
import org.sorapointa.proto.InBattleMechanicusPlayerInfo.*;
import org.sorapointa.proto.InBattleMechanicusPlayerInfo;
import org.sorapointa.proto.InBattleMechanicusStageType.*;
import org.sorapointa.proto.InBattleMechanicusStageType;

public class InBattleMechanicusInfo {
    @Tag(tag=5) public Integer leftMonsterNum = null;
    @Tag(tag=13) public Integer waitSeconds = null;
    @Tag(tag=410) public List<Integer> entranceList = new ArrayList<>();
    @Tag(tag=115) public List<Integer> exitList = new ArrayList<>();
    @Tag(tag=11) public List<InBattleMechanicusCardInfo> historyCardList = new ArrayList<>();
    @Tag(tag=10) public Integer maxEscapeMonsterNum = null;
    @Tag(tag=4) public Integer buildingStageDuration = null;
    @Tag(tag=8) public Long durationMs = null;
    @Tag(tag=9) public Integer stage = null;
    @Tag(tag=12) public Integer totalRound = null;
    @Tag(tag=14) public List<InBattleMechanicusMonsterInfo> monsterList = new ArrayList<>();
    @Tag(tag=6) public Integer escapedMonsterNum = null;
    @Tag(tag=3) public Integer round = null;
    @Tag(tag=15) public List<InBattleMechanicusCardInfo> pickCardList = new ArrayList<>();
    @Tag(tag=7) public List<InBattleMechanicusPlayerInfo> playerList = new ArrayList<>();
    @Tag(tag=1) public Long waitBeginTimeUs = null;
    @Tag(tag=2) public Long beginTimeMs = null;
}
