package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ExhibitionDisplayInfo.*;
import org.sorapointa.proto.ExhibitionDisplayInfo;
import org.sorapointa.proto.ProfilePicture.*;
import org.sorapointa.proto.ProfilePicture;

public class ScenePlayBattleSettlePlayerInfo {
    @Tag(tag=14) public List<ExhibitionDisplayInfo> cardList = new ArrayList<>();
    @Tag(tag=10) public ProfilePicture profilePicture = null;
    @Tag(tag=11) public Integer headImage = null;
    @Tag(tag=4) public Integer statisticId = null;
    @Tag(tag=1) public Integer uid = null;
    @Tag(tag=5,isSigned=true) public Long param = null;
    @Tag(tag=12) public String onlineId = null;
    @Tag(tag=15) public String nickname = null;
}
