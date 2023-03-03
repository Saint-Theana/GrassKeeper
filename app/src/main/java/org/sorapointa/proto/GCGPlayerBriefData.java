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

    @Tag(tag=8) public List<MapCardFaceMap> cardFaceMap = new ArrayList<>();
    @Tag(tag=9) public String nickName = null;
    @Tag(tag=12) public ProfilePicture profilePicture = null;
    @Tag(tag=3) public List<Integer> cardIdList = new ArrayList<>();
    @Tag(tag=5) public Integer controllerId = null;
    @Tag(tag=10) public Integer uid = null;
}
