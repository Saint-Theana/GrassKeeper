package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilityControlBlock.*;
import org.sorapointa.proto.AbilityControlBlock;
import org.sorapointa.proto.AbilitySyncStateInfo.*;
import org.sorapointa.proto.AbilitySyncStateInfo;
import org.sorapointa.proto.Avatar.*;
import org.sorapointa.proto.Avatar;
import org.sorapointa.proto.AvatarInfo.*;
import org.sorapointa.proto.AvatarInfo;
import org.sorapointa.proto.SceneEntityInfo.*;
import org.sorapointa.proto.SceneEntityInfo;
import org.sorapointa.proto.ServerBuff.*;
import org.sorapointa.proto.ServerBuff;

public class SceneTeamAvatar {
    @Tag(tag=8) public Boolean isReconnect = null;
    @Tag(tag=10) public AbilityControlBlock abilityControlBlock = null;
    @Tag(tag=13) public Integer entityId = null;
    @Tag(tag=15) public Integer weaponEntityId = null;
    @Tag(tag=776) public Boolean isOnScene = null;
    @Tag(tag=3) public Long weaponGuid = null;
    @Tag(tag=14) public List<ServerBuff> serverBuffList = new ArrayList<>();
    @Tag(tag=6) public AbilitySyncStateInfo weaponAbilityInfo = null;
    @Tag(tag=4) public Integer sceneId = null;
    @Tag(tag=7) public Boolean isPlayerCurAvatar = null;
    @Tag(tag=9) public Long avatarGuid = null;
    @Tag(tag=5) public Avatar sceneAvatarInfo = null;
    @Tag(tag=2) public AvatarInfo avatarInfo = null;
    @Tag(tag=1) public SceneEntityInfo sceneEntityInfo = null;
    @Tag(tag=11) public Integer playerUid = null;
    @Tag(tag=12) public AbilitySyncStateInfo avatarAbilityInfo = null;
}
