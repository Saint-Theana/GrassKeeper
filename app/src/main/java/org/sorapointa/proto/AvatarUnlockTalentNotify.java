package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarUnlockTalentNotify {
    @Tag(tag=14) public Integer entityId = null;
    @Tag(tag=13) public Long avatarGuid = null;
    @Tag(tag=10) public Integer talentId = null;
    @Tag(tag=1) public Integer skillDepotId = null;
}
