package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BrickBreakerLevelInfo {
    @Tag(tag=12) public List<Integer> chosenSkillList = new ArrayList<>();
    @Tag(tag=2) public Integer levelId = null;
    @Tag(tag=11) public Boolean isFinish = null;
    @Tag(tag=1) public Boolean isCanStart = null;
    @Tag(tag=6) public Integer maxScore = null;
    @Tag(tag=4) public List<Integer> chosenAvatarList = new ArrayList<>();
}
