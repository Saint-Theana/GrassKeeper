package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LanternRiteEndFireworksReformRsp {
    public enum LanternRiteEndFireworksReformRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8114) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer finalScore = null;
    @Tag(tag=10) public Integer challengeId = null;
    @Tag(tag=9) public Integer stageId = null;
    @Tag(tag=6) public Boolean isUnlockFireworks = null;
    @Tag(tag=4) public Boolean isFullScore = null;
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public Boolean isStaminaUp = null;
    @Tag(tag=11) public Boolean isUnlockNewSkill = null;
    @Tag(tag=12) public Boolean isNewRecord = null;
}
