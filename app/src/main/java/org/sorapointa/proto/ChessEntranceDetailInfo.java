package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChessEntranceDetailInfo {
    @Tag(tag=6) public List<ChessEntranceInfo> infoList = new ArrayList<>();
}
