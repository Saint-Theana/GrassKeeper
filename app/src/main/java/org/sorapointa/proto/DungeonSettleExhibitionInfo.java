package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonSettleExhibitionInfo {
    @Tag(tag=2) public List<ExhibitionDisplayInfo> cardList = new ArrayList<>();
    @Tag(tag=13) public OnlinePlayerInfo playerInfo = null;
}
