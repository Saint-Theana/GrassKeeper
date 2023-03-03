package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.LanternRiteFireworksReformFactorInfo.*;
import org.sorapointa.proto.LanternRiteFireworksReformFactorInfo;

public class LanternRiteDoFireworksReformRsp {
    @Tag(tag=7) public Integer stageId = null;
    @Tag(tag=13) public Boolean isLucky = null;
    @Tag(tag=8) public Integer challengeId = null;
    @Tag(tag=2) public List<LanternRiteFireworksReformFactorInfo> factorInfoList = new ArrayList<>();
    @Tag(tag=10) public Integer staminaValue = null;
    @Tag(tag=15) public Integer reformScore = null;
    @Tag(tag=11) public Integer fireElementValue = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=12) public Integer fireElementAdditionRatio = null;
}
