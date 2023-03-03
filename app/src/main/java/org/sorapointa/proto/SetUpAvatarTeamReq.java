package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetUpAvatarTeamReq {
    @Tag(tag=3) public Integer teamId = null;
    @Tag(tag=7) public List<Long> avatarTeamGuidList = new ArrayList<>();
    @Tag(tag=5) public Long curAvatarGuid = null;
}
