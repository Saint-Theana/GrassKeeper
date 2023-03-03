package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ProudSkillExtraLevelNotify {
    @Tag(tag=11) public Integer talentType = null;
    @Tag(tag=8) public Integer talentIndex = null;
    @Tag(tag=15) public Long avatarGuid = null;
    @Tag(tag=3) public Integer extraLevel = null;
}
