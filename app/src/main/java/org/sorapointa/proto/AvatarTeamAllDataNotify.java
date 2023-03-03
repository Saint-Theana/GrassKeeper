package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AvatarTeam.*;
import org.sorapointa.proto.AvatarTeam;

public class AvatarTeamAllDataNotify {
    public static class MapAvatarTeamMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public AvatarTeam value = null;
    }

    @Tag(tag=6) public List<Long> tempAvatarGuidList = new ArrayList<>();
    @Tag(tag=3) public List<MapAvatarTeamMap> avatarTeamMap = new ArrayList<>();
    @Tag(tag=1) public List<Integer> backupAvatarTeamOrderList = new ArrayList<>();
}
