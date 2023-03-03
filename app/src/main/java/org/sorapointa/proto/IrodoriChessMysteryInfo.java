package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.IrodoriChessEntranceDetailInfo.*;
import org.sorapointa.proto.IrodoriChessEntranceDetailInfo;

public class IrodoriChessMysteryInfo {
    @Tag(tag=5) public IrodoriChessEntranceDetailInfo entranceDetailInfo = null;
    @Tag(tag=2) public List<Integer> entrancePointIdList = new ArrayList<>();
    @Tag(tag=13) public List<Integer> exitPointIdList = new ArrayList<>();
}
