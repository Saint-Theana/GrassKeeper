package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AvatarEnterSceneInfo.*;
import org.sorapointa.proto.AvatarEnterSceneInfo;
import org.sorapointa.proto.MPLevelEntityInfo.*;
import org.sorapointa.proto.MPLevelEntityInfo;
import org.sorapointa.proto.TeamEnterSceneInfo.*;
import org.sorapointa.proto.TeamEnterSceneInfo;

public class PlayerEnterSceneInfoNotify {
    @Tag(tag=8) public TeamEnterSceneInfo teamEnterInfo = null;
    @Tag(tag=12) public Integer enterSceneToken = null;
    @Tag(tag=7) public List<AvatarEnterSceneInfo> avatarEnterInfo = new ArrayList<>();
    @Tag(tag=6) public Integer curAvatarEntityId = null;
    @Tag(tag=5) public MPLevelEntityInfo mpLevelEntityInfo = null;
}
