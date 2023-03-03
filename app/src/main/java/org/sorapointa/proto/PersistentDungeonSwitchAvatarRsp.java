package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PersistentDungeonSwitchAvatarRsp {
    @Tag(tag=14) public List<Long> avatarTeamGuidList = new ArrayList<>();
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=15) public Long curAvatarGuid = null;
}
