package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarSkillMaxChargeCountNotify {
    @Tag(tag=6) public Integer skillId = null;
    @Tag(tag=11) public Integer maxChargeCount = null;
    @Tag(tag=7) public Long avatarGuid = null;
}
