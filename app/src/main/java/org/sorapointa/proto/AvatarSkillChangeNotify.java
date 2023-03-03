package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarSkillChangeNotify {
    @Tag(tag=11) public Integer curLevel = null;
    @Tag(tag=2) public Long avatarGuid = null;
    @Tag(tag=7) public Integer entityId = null;
    @Tag(tag=13) public Integer skillDepotId = null;
    @Tag(tag=1) public Integer oldLevel = null;
    @Tag(tag=6) public Integer avatarSkillId = null;
}
