package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerEnterSceneInfoNotify {
    public enum PlayerEnterSceneInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=212) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=7) public MPLevelEntityInfo mpLevelEntityInfo = null;
    @Tag(tag=5) public TeamEnterSceneInfo teamEnterInfo = null;
    @Tag(tag=8) public Integer curAvatarEntityId = null;
    @Tag(tag=13) public Integer enterSceneToken = null;
    @Tag(tag=12) public List<AvatarEnterSceneInfo> avatarEnterInfo = new ArrayList<>();
}
