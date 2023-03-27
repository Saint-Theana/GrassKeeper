package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarDataNotify {
    public static class MapAvatarTeamMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public AvatarTeam value = null;
    }

    public enum AvatarDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1645) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Long chooseAvatarGuid = null;
    @Tag(tag=15) public List<Integer> ownedCostumeList = new ArrayList<>();
    @Tag(tag=8) public List<AvatarInfo> avatarList = new ArrayList<>();
    @Tag(tag=5) public Integer curAvatarTeamId = null;
    @Tag(tag=6) public List<MapAvatarTeamMap> avatarTeamMap = new ArrayList<>();
    @Tag(tag=2) public List<Integer> ownedFlycloakList = new ArrayList<>();
    @Tag(tag=7) public List<AvatarRenameInfo> avatarRenameList = new ArrayList<>();
    @Tag(tag=12) public List<Integer> backupAvatarTeamOrderList = new ArrayList<>();
    @Tag(tag=14) public List<Long> tempAvatarGuidList = new ArrayList<>();
}
