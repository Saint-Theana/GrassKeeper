package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EffigyChallengeV2LevelData {
    @Tag(tag=13) public Boolean isLevelOpen = null;
    @Tag(tag=14) public Integer challengeModeDifficultyOpen = null;
    @Tag(tag=15) public Integer levelId = null;
    @Tag(tag=5) public Integer challengeModeLastChooseSkillNo = null;
    @Tag(tag=7) public Integer bestCostTime = null;
    @Tag(tag=9) public Integer challengeModeDifficultyPass = null;
}
