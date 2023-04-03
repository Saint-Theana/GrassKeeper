package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ProfilePicture.*;
import org.sorapointa.proto.ProfilePicture;

public class ActivityRecvGiftData {
    public static class MapGiftNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=15) public String remarkName = null;
    @Tag(tag=10) public String nickname = null;
    @Tag(tag=2) public Integer uid = null;
    @Tag(tag=8) public List<MapGiftNumMap> giftNumMap = new ArrayList<>();
    @Tag(tag=5) public ProfilePicture profilePicture = null;
}
