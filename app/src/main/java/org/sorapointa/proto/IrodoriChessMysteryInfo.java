package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IrodoriChessMysteryInfo {
    @Tag(tag=5) public List<Integer> exitPointIdList = new ArrayList<>();
    @Tag(tag=8) public IrodoriChessEntranceDetailInfo entranceDetailInfo = null;
    @Tag(tag=2) public List<Integer> entrancePointIdList = new ArrayList<>();
}
