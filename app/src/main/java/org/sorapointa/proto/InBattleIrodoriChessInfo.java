package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.IrodoriChessMysteryInfo.*;
import org.sorapointa.proto.IrodoriChessMysteryInfo;

public class InBattleIrodoriChessInfo {
    @Tag(tag=3) public IrodoriChessMysteryInfo mysteryInfo = null;
    @Tag(tag=12) public Integer leftMonsters = null;
    @Tag(tag=13) public List<Integer> selectedCardIdList = new ArrayList<>();
    @Tag(tag=7) public Integer buildingPoints = null;
    @Tag(tag=4) public Integer settleScore = null;
}
