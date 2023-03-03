package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarSkillUpgradeReq {
    @Tag(tag=7) public Long avatarGuid = null;
    @Tag(tag=3) public Integer oldLevel = null;
    @Tag(tag=4) public Integer avatarSkillId = null;
}
