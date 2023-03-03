package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UnlockAvatarTalentReq {
    @Tag(tag=13) public Integer talentId = null;
    @Tag(tag=3) public Long avatarGuid = null;
}
