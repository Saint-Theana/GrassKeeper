package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FungusFighterTrainingInfo {
    @Tag(tag=5) public Integer restSkillCount = null;
    @Tag(tag=15) public Integer buffId = null;
    @Tag(tag=4) public Integer maxSkillCount = null;
    @Tag(tag=1) public Integer maxMonsterCount = null;
    @Tag(tag=10) public Integer killedMonsterCount = null;
    @Tag(tag=3) public Integer buffLastTime = null;
    @Tag(tag=6) public Integer buffStartTime = null;
}
