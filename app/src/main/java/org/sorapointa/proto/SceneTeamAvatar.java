package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilityControlBlock.*;
import org.sorapointa.proto.AbilityControlBlock;
import org.sorapointa.proto.AbilitySyncStateInfo.*;
import org.sorapointa.proto.AbilitySyncStateInfo;
import org.sorapointa.proto.AvatarInfo.*;
import org.sorapointa.proto.AvatarInfo;
import org.sorapointa.proto.SceneAvatarInfo.*;
import org.sorapointa.proto.SceneAvatarInfo;
import org.sorapointa.proto.SceneEntityInfo.*;
import org.sorapointa.proto.SceneEntityInfo;
import org.sorapointa.proto.ServerBuff.*;
import org.sorapointa.proto.ServerBuff;

public class SceneTeamAvatar {
    @Tag(tag=5) public AbilitySyncStateInfo avatarAbilityInfo = null;
    @Tag(tag=8) public AvatarInfo avatarInfo = null;
    @Tag(tag=152) public Boolean isOnScene = null;
    @Tag(tag=9) public Integer entityId = null;
    @Tag(tag=15) public Long avatarGuid = null;
    @Tag(tag=1) public Integer sceneId = null;
    @Tag(tag=7) public Integer weaponEntityId = null;
    @Tag(tag=3) public SceneAvatarInfo sceneAvatarInfo = null;
    @Tag(tag=4) public Long weaponGuid = null;
    @Tag(tag=11) public AbilitySyncStateInfo weaponAbilityInfo = null;
    @Tag(tag=12) public SceneEntityInfo sceneEntityInfo = null;
    @Tag(tag=14) public Integer playerUid = null;
    @Tag(tag=6) public Boolean isReconnect = null;
    @Tag(tag=2) public AbilityControlBlock abilityControlBlock = null;
    @Tag(tag=13) public Boolean isPlayerCurAvatar = null;
    @Tag(tag=10) public List<ServerBuff> serverBuffList = new ArrayList<>();
}
