package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SceneTeamAvatar.*;
import org.sorapointa.proto.SceneTeamAvatar;

public class SceneTeamUpdateNotify {
    @Tag(tag=11) public List<SceneTeamAvatar> sceneTeamAvatarList = new ArrayList<>();
    @Tag(tag=15) public Boolean isInMp = null;
}
