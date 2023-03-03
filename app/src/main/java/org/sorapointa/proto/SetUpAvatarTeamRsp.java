package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetUpAvatarTeamRsp {
    @Tag(tag=1) public List<Long> avatarTeamGuidList = new ArrayList<>();
    @Tag(tag=6) public Integer teamId = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public Long curAvatarGuid = null;
}
