package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ProfilePicture.*;
import org.sorapointa.proto.ProfilePicture;

public class BlessingFriendPicData {
    public static class MapPicNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=4) public List<MapPicNumMap> picNumMap = new ArrayList<>();
    @Tag(tag=5) public Integer avatarId = null;
    @Tag(tag=11) public String remarkName = null;
    @Tag(tag=14) public String nickname = null;
    @Tag(tag=1) public String signature = null;
    @Tag(tag=6) public ProfilePicture profilePicture = null;
    @Tag(tag=9) public Integer uid = null;
}
