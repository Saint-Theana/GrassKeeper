package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EffigyChallengeV2ChooseSkillRsp {
    @Tag(tag=15) public Integer levelId = null;
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public Integer challengeModeSkillNo = null;
}
