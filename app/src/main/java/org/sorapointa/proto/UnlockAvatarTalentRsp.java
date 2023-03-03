package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UnlockAvatarTalentRsp {
    @Tag(tag=2) public Integer talentId = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public Long avatarGuid = null;
}
