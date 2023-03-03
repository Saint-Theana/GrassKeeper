package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ExhibitionDisplayInfo.*;
import org.sorapointa.proto.ExhibitionDisplayInfo;
import org.sorapointa.proto.ProfilePicture.*;
import org.sorapointa.proto.ProfilePicture;

public class HideAndSeekSettleInfo {
    @Tag(tag=2) public Integer uid = null;
    @Tag(tag=1) public ProfilePicture profilePicture = null;
    @Tag(tag=8) public List<ExhibitionDisplayInfo> cardList = new ArrayList<>();
    @Tag(tag=3) public String nickname = null;
    @Tag(tag=4) public Integer headImage = null;
    @Tag(tag=10) public String onlineId = null;
}
