package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OnlinePlayerInfo.*;
import org.sorapointa.proto.OnlinePlayerInfo;
import org.sorapointa.proto.ExhibitionDisplayInfo.*;
import org.sorapointa.proto.ExhibitionDisplayInfo;

public class IslandPartyGallerySettleInfo {
    @Tag(tag=3) public OnlinePlayerInfo playerInfo = null;
    @Tag(tag=9) public List<ExhibitionDisplayInfo> cardList = new ArrayList<>();
}
