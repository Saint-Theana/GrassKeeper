package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChangeMpTeamAvatarReq {
    @Tag(tag=4) public Long curAvatarGuid = null;
    @Tag(tag=8) public List<Long> avatarGuidList = new ArrayList<>();
}
