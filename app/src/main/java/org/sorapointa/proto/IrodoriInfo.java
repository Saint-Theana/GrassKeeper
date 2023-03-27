package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IrodoriInfo {
    @Tag(tag=6) public IrodoriFlowerData flowerData = null;
    @Tag(tag=14) public IrodoriPoetryData poetryData = null;
    @Tag(tag=10) public IrodoriChessData chessData = null;
    @Tag(tag=15) public List<IrodoriMasterLevelInfo> masterLevelList = new ArrayList<>();
}
