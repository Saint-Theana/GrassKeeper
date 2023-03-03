package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.LanternRiteFireworksReformFactorInfo.*;
import org.sorapointa.proto.LanternRiteFireworksReformFactorInfo;
import org.sorapointa.proto.LanternRiteFireworksReformSkillInfo.*;
import org.sorapointa.proto.LanternRiteFireworksReformSkillInfo;

public class LanternRiteStartFireworksReformRsp {
    @Tag(tag=15) public List<LanternRiteFireworksReformFactorInfo> factorInfoList = new ArrayList<>();
    @Tag(tag=13) public Integer fireElementAdditionRatio = null;
    @Tag(tag=2) public Integer staminaValue = null;
    @Tag(tag=8) public List<LanternRiteFireworksReformSkillInfo> skillInfoList = new ArrayList<>();
    @Tag(tag=6) public Integer reformScore = null;
    @Tag(tag=12) public Integer stageId = null;
    @Tag(tag=11) public Integer challengeId = null;
    @Tag(tag=14) public Integer fireElementValue = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
}
