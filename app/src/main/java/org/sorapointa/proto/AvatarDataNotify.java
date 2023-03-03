package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AvatarInfo.*;
import org.sorapointa.proto.AvatarInfo;
import org.sorapointa.proto.AvatarTeam.*;
import org.sorapointa.proto.AvatarTeam;

public class AvatarDataNotify {
    public static class MapAvatarTeamMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public AvatarTeam value = null;
    }

    @Tag(tag=11) public List<Integer> ownedCostumeList = new ArrayList<>();
    @Tag(tag=8) public Long chooseAvatarGuid = null;
    @Tag(tag=7) public List<MapAvatarTeamMap> avatarTeamMap = new ArrayList<>();
    @Tag(tag=9) public List<Integer> backupAvatarTeamOrderList = new ArrayList<>();
    @Tag(tag=12) public List<Long> tempAvatarGuidList = new ArrayList<>();
    @Tag(tag=1) public List<Integer> ownedFlycloakList = new ArrayList<>();
    @Tag(tag=6) public List<AvatarInfo> avatarList = new ArrayList<>();
    @Tag(tag=2) public Integer curAvatarTeamId = null;
}
