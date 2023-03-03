package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChessCardInfo.*;
import org.sorapointa.proto.ChessCardInfo;
import org.sorapointa.proto.ChessMysteryInfo.*;
import org.sorapointa.proto.ChessMysteryInfo;
import org.sorapointa.proto.ChessPlayerInfo.*;
import org.sorapointa.proto.ChessPlayerInfo;

public class InBattleChessInfo {
    public static class MapPlayerInfoMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public ChessPlayerInfo value = null;
    }

    @Tag(tag=2) public List<Integer> banCardTagList = new ArrayList<>();
    @Tag(tag=4) public Integer round = null;
    @Tag(tag=9) public List<ChessCardInfo> selectedCardInfoList = new ArrayList<>();
    @Tag(tag=1) public ChessMysteryInfo mysteryInfo = null;
    @Tag(tag=8) public List<MapPlayerInfoMap> playerInfoMap = new ArrayList<>();
    @Tag(tag=6) public Integer maxEscapableMonsters = null;
    @Tag(tag=12) public Integer escapedMonsters = null;
    @Tag(tag=14) public Integer totalRound = null;
    @Tag(tag=15) public Integer leftMonsters = null;
}
