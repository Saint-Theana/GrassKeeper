package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.IrodoriChessEntranceDetailInfo.*;
import org.sorapointa.proto.IrodoriChessEntranceDetailInfo;

public class IrodoriChessMapData {
    @Tag(tag=6) public Integer mapId = null;
    @Tag(tag=7) public IrodoriChessEntranceDetailInfo entranceDetailInfo = null;
    @Tag(tag=3) public List<Integer> equipedCardList = new ArrayList<>();
    @Tag(tag=8) public Integer bestScore = null;
}
