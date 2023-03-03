package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChessNormalCardInfo.*;
import org.sorapointa.proto.ChessNormalCardInfo;

public class ChessPlayerInfo {
    @Tag(tag=5) public Integer uid = null;
    @Tag(tag=10) public Integer freeRefreshLimit = null;
    @Tag(tag=3) public List<ChessNormalCardInfo> candidateCardInfoList = new ArrayList<>();
    @Tag(tag=12) public Integer buildingPoints = null;
    @Tag(tag=6) public Integer candidateIndex = null;
    @Tag(tag=13) public Integer freeRefreshCount = null;
    @Tag(tag=7) public Integer refreshCost = null;
}
