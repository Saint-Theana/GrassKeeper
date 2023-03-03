package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EffigyChallengeV2LevelData {
    @Tag(tag=1) public Integer challengeModeDifficultyPass = null;
    @Tag(tag=5) public Integer levelId = null;
    @Tag(tag=10) public Integer challengeModeLastChooseSkillNo = null;
    @Tag(tag=12) public Integer bestCostTime = null;
    @Tag(tag=7) public Boolean isLevelOpen = null;
    @Tag(tag=13) public Integer challengeModeDifficultyOpen = null;
}
