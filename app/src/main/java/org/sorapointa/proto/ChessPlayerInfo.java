package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChessNormalCardInfo.*;
import org.sorapointa.proto.ChessNormalCardInfo;

public class ChessPlayerInfo {
    @Tag(tag=13) public Integer buildingPoints = null;
    @Tag(tag=12) public Integer candidateIndex = null;
    @Tag(tag=2) public Integer freeRefreshLimit = null;
    @Tag(tag=6) public List<ChessNormalCardInfo> candidateCardInfoList = new ArrayList<>();
    @Tag(tag=11) public Integer uid = null;
    @Tag(tag=8) public Integer refreshCost = null;
    @Tag(tag=3) public Integer freeRefreshCount = null;
}
