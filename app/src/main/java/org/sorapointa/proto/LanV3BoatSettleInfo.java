package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ProfilePicture.*;
import org.sorapointa.proto.ProfilePicture;
import org.sorapointa.proto.ExhibitionDisplayInfo.*;
import org.sorapointa.proto.ExhibitionDisplayInfo;

public class LanV3BoatSettleInfo {
    @Tag(tag=7) public Integer uid = null;
    @Tag(tag=5) public List<ExhibitionDisplayInfo> cardList = new ArrayList<>();
    @Tag(tag=11) public ProfilePicture profilePicture = null;
    @Tag(tag=14) public String nickname = null;
    @Tag(tag=2) public String onlineId = null;
    @Tag(tag=15) public Integer headImage = null;
}
