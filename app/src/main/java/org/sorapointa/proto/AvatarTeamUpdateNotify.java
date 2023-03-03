package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AvatarTeam.*;
import org.sorapointa.proto.AvatarTeam;

public class AvatarTeamUpdateNotify {
    public static class MapAvatarTeamMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public AvatarTeam value = null;
    }

    @Tag(tag=2) public List<MapAvatarTeamMap> avatarTeamMap = new ArrayList<>();
    @Tag(tag=13) public List<Long> tempAvatarGuidList = new ArrayList<>();
}
