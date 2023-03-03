package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChessMonsterInfo.*;
import org.sorapointa.proto.ChessMonsterInfo;

public class ChessEntranceInfo {
    @Tag(tag=14) public List<ChessMonsterInfo> monsterInfoList = new ArrayList<>();
    @Tag(tag=15) public Integer entranceIndex = null;
    @Tag(tag=8) public Integer entrancePointId = null;
}
