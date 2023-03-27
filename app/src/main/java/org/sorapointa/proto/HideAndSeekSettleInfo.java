package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HideAndSeekSettleInfo {
    @Tag(tag=1) public Integer uid = null;
    @Tag(tag=2) public List<ExhibitionDisplayInfo> cardList = new ArrayList<>();
    @Tag(tag=3) public Integer headImage = null;
    @Tag(tag=10) public String onlineId = null;
    @Tag(tag=9) public String nickname = null;
    @Tag(tag=5) public ProfilePicture profilePicture = null;
}
