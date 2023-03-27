package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CoinCollectStageInfo {
    @Tag(tag=6) public Integer levelId = null;
    @Tag(tag=12) public Integer playIndex = null;
    @Tag(tag=5) public List<CoinCollectPlayerInfo> playerInfoList = new ArrayList<>();
}
