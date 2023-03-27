package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarTeamUpdateNotify {
    public static class MapAvatarTeamMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public AvatarTeam value = null;
    }

    public enum AvatarTeamUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1723) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public List<MapAvatarTeamMap> avatarTeamMap = new ArrayList<>();
    @Tag(tag=8) public List<Long> tempAvatarGuidList = new ArrayList<>();
}
