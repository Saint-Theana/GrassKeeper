package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChessEntranceInfo {
    @Tag(tag=7) public List<ChessMonsterInfo> monsterInfoList = new ArrayList<>();
    @Tag(tag=6) public Integer entrancePointId = null;
    @Tag(tag=9) public Integer entranceIndex = null;
}
