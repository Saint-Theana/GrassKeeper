package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LanternRiteEndFireworksReformRsp {
    @Tag(tag=10) public Boolean isFullScore = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public Boolean isUnlockFireworks = null;
    @Tag(tag=15) public Integer stageId = null;
    @Tag(tag=12) public Boolean isUnlockNewSkill = null;
    @Tag(tag=4) public Boolean isStaminaUp = null;
    @Tag(tag=13) public Integer finalScore = null;
    @Tag(tag=5) public Integer challengeId = null;
    @Tag(tag=9) public Boolean isNewRecord = null;
}
