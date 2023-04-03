package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ProfilePicture.*;
import org.sorapointa.proto.ProfilePicture;

public class GCGPlayerBriefData {
    public static class MapCardFaceMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=7) public String psnId = null;
    @Tag(tag=4) public List<MapCardFaceMap> cardFaceMap = new ArrayList<>();
    @Tag(tag=14) public ProfilePicture profilePicture = null;
    @Tag(tag=3) public Integer uid = null;
    @Tag(tag=2) public String nickName = null;
    @Tag(tag=10) public String onlineId = null;
    @Tag(tag=11) public Integer controllerId = null;
    @Tag(tag=13) public List<Integer> cardIdList = new ArrayList<>();
}
