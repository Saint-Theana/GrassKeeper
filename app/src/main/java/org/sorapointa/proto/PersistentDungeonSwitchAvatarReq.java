package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PersistentDungeonSwitchAvatarReq {
    @Tag(tag=8) public Long curAvatarGuid = null;
    @Tag(tag=3) public List<Long> avatarTeamGuidList = new ArrayList<>();
}
