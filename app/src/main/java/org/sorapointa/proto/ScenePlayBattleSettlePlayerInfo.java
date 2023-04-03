package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ProfilePicture.*;
import org.sorapointa.proto.ProfilePicture;
import org.sorapointa.proto.ExhibitionDisplayInfo.*;
import org.sorapointa.proto.ExhibitionDisplayInfo;

public class ScenePlayBattleSettlePlayerInfo {
    @Tag(tag=9) public String nickname = null;
    @Tag(tag=11) public String onlineId = null;
    @Tag(tag=3) public Integer statisticId = null;
    @Tag(tag=1) public List<ExhibitionDisplayInfo> cardList = new ArrayList<>();
    @Tag(tag=6) public Integer uid = null;
    @Tag(tag=13) public ProfilePicture profilePicture = null;
    @Tag(tag=4) public Integer headImage = null;
    @Tag(tag=12,isSigned=true) public Long param = null;
}
