package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilitySyncStateInfo.*;
import org.sorapointa.proto.AbilitySyncStateInfo;
import org.sorapointa.proto.ServerBuff.*;
import org.sorapointa.proto.ServerBuff;

public class AvatarEnterSceneInfo {
    @Tag(tag=14) public List<ServerBuff> serverBuffList = new ArrayList<>();
    @Tag(tag=7) public Integer avatarEntityId = null;
    @Tag(tag=12) public AbilitySyncStateInfo weaponAbilityInfo = null;
    @Tag(tag=10) public Integer weaponEntityId = null;
    @Tag(tag=2) public AbilitySyncStateInfo avatarAbilityInfo = null;
    @Tag(tag=13) public Long avatarGuid = null;
    @Tag(tag=9) public Long weaponGuid = null;
    @Tag(tag=5) public List<Integer> buffIdList = new ArrayList<>();
}
