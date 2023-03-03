package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.IrodoriChessMapData.*;
import org.sorapointa.proto.IrodoriChessMapData;

public class IrodoriChessLevelData {
    @Tag(tag=8) public Integer openTime = null;
    @Tag(tag=15) public Integer levelId = null;
    @Tag(tag=7) public IrodoriChessMapData hardMapData = null;
    @Tag(tag=11) public IrodoriChessMapData normalMapData = null;
}
