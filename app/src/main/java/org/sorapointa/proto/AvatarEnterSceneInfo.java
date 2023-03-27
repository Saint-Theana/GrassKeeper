package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarEnterSceneInfo {
    @Tag(tag=8) public Long avatarGuid = null;
    @Tag(tag=13) public Integer weaponEntityId = null;
    @Tag(tag=1) public AbilitySyncStateInfo avatarAbilityInfo = null;
    @Tag(tag=7) public List<Integer> buffIdList = new ArrayList<>();
    @Tag(tag=10) public Integer avatarEntityId = null;
    @Tag(tag=4) public List<ServerBuff> serverBuffList = new ArrayList<>();
    @Tag(tag=11) public AbilitySyncStateInfo weaponAbilityInfo = null;
    @Tag(tag=14) public Long weaponGuid = null;
}
