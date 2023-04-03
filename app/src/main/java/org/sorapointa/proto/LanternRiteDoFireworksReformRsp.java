package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.LanternRiteFireworksReformFactorInfo.*;
import org.sorapointa.proto.LanternRiteFireworksReformFactorInfo;

public class LanternRiteDoFireworksReformRsp {
    public enum LanternRiteDoFireworksReformRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8644) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public Integer fireElementAdditionRatio = null;
    @Tag(tag=7) public Boolean isLucky = null;
    @Tag(tag=6) public List<LanternRiteFireworksReformFactorInfo> factorInfoList = new ArrayList<>();
    @Tag(tag=1) public Integer stageId = null;
    @Tag(tag=9) public Integer challengeId = null;
    @Tag(tag=5) public Integer staminaValue = null;
    @Tag(tag=14) public Integer reformScore = null;
    @Tag(tag=2) public Integer fireElementValue = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
