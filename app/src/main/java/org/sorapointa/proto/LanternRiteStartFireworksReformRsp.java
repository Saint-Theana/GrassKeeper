package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.LanternRiteFireworksReformFactorInfo.*;
import org.sorapointa.proto.LanternRiteFireworksReformFactorInfo;
import org.sorapointa.proto.LanternRiteFireworksReformSkillInfo.*;
import org.sorapointa.proto.LanternRiteFireworksReformSkillInfo;

public class LanternRiteStartFireworksReformRsp {
    public enum LanternRiteStartFireworksReformRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8757) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer fireElementValue = null;
    @Tag(tag=7) public Integer staminaValue = null;
    @Tag(tag=1) public List<LanternRiteFireworksReformFactorInfo> factorInfoList = new ArrayList<>();
    @Tag(tag=12) public Integer challengeId = null;
    @Tag(tag=11) public Integer fireElementAdditionRatio = null;
    @Tag(tag=14) public Integer reformScore = null;
    @Tag(tag=4) public Integer stageId = null;
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=15) public List<LanternRiteFireworksReformSkillInfo> skillInfoList = new ArrayList<>();
}
