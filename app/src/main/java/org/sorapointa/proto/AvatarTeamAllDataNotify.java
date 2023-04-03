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

    public enum AMCELHNAEJK {
        @Tag(tag=0) None ,
        @Tag(tag=1763) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public List<Long> tempAvatarGuidList = new ArrayList<>();
    @Tag(tag=14) public List<Integer> backupAvatarTeamOrderList = new ArrayList<>();
    @Tag(tag=12) public List<MapAvatarTeamMap> avatarTeamMap = new ArrayList<>();
}
