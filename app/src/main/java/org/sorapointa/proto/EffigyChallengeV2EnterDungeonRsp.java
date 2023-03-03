package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EffigyChallengeV2EnterDungeonRsp {
    @Tag(tag=11) public Integer challengeModeSkillNo = null;
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Integer challengeModeDifficulty = null;
    @Tag(tag=13) public Integer levelId = null;
}
