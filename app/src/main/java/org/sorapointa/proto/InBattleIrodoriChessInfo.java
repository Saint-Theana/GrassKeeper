package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InBattleIrodoriChessInfo {
    @Tag(tag=3) public List<Integer> selectedCardIdList = new ArrayList<>();
    @Tag(tag=11) public Integer leftMonsters = null;
    @Tag(tag=10) public IrodoriChessMysteryInfo mysteryInfo = null;
    @Tag(tag=8) public Integer settleScore = null;
    @Tag(tag=6) public Integer buildingPoints = null;
}
