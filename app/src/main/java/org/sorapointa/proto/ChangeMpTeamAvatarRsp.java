package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChangeMpTeamAvatarRsp {
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public List<Long> avatarGuidList = new ArrayList<>();
    @Tag(tag=13) public Long curAvatarGuid = null;
}
