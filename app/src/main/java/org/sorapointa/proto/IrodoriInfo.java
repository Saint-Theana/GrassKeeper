package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.IrodoriFlowerData.*;
import org.sorapointa.proto.IrodoriFlowerData;
import org.sorapointa.proto.IrodoriPoetryData.*;
import org.sorapointa.proto.IrodoriPoetryData;
import org.sorapointa.proto.IrodoriChessData.*;
import org.sorapointa.proto.IrodoriChessData;
import org.sorapointa.proto.IrodoriMasterLevelInfo.*;
import org.sorapointa.proto.IrodoriMasterLevelInfo;

public class IrodoriInfo {
    @Tag(tag=6) public IrodoriFlowerData flowerData = null;
    @Tag(tag=14) public IrodoriPoetryData poetryData = null;
    @Tag(tag=10) public IrodoriChessData chessData = null;
    @Tag(tag=15) public List<IrodoriMasterLevelInfo> masterLevelList = new ArrayList<>();
}
