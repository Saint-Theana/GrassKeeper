package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.IrodoriChessEntranceInfo.*;
import org.sorapointa.proto.IrodoriChessEntranceInfo;

public class IrodoriChessEntranceDetailInfo {
    @Tag(tag=15) public List<IrodoriChessEntranceInfo> infoList = new ArrayList<>();
}
