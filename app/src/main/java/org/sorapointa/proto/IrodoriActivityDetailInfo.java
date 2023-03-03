package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.IrodoriChessData.*;
import org.sorapointa.proto.IrodoriChessData;
import org.sorapointa.proto.IrodoriFlowerData.*;
import org.sorapointa.proto.IrodoriFlowerData;
import org.sorapointa.proto.IrodoriMasterLevelInfo.*;
import org.sorapointa.proto.IrodoriMasterLevelInfo;
import org.sorapointa.proto.IrodoriPoetryData.*;
import org.sorapointa.proto.IrodoriPoetryData;

public class IrodoriActivityDetailInfo {
    @Tag(tag=11) public List<IrodoriMasterLevelInfo> masterLevelList = new ArrayList<>();
    @Tag(tag=6) public IrodoriFlowerData flowerData = null;
    @Tag(tag=8) public IrodoriPoetryData poetryData = null;
    @Tag(tag=14) public IrodoriChessData chessData = null;
}
