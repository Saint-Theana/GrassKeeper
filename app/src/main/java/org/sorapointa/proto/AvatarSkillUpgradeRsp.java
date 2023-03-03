package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarSkillUpgradeRsp {
    @Tag(tag=11) public Long avatarGuid = null;
    @Tag(tag=14) public Integer curLevel = null;
    @Tag(tag=9) public Integer avatarSkillId = null;
    @Tag(tag=3) public Integer oldLevel = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
}
