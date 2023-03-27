package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneTeamUpdateNotify {
    public enum SceneTeamUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1623) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Boolean isInMp = null;
    @Tag(tag=12) public List<SceneTeamAvatar> sceneTeamAvatarList = new ArrayList<>();
}
