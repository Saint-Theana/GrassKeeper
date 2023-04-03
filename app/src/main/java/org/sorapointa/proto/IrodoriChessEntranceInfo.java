package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.IrodoriChessMonsterInfo.*;
import org.sorapointa.proto.IrodoriChessMonsterInfo;

public class IrodoriChessEntranceInfo {
    @Tag(tag=10) public Integer entrancePointId = null;
    @Tag(tag=8) public List<IrodoriChessMonsterInfo> monsterInfoList = new ArrayList<>();
}
