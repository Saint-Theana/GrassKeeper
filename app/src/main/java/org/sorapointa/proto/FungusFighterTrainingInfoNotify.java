package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FungusFighterTrainingInfoNotify {
    @Tag(tag=3) public Integer buffStartTime = null;
    @Tag(tag=7) public Integer maxSkillCount = null;
    @Tag(tag=8) public Integer maxMonsterCount = null;
    @Tag(tag=14) public Integer buffId = null;
    @Tag(tag=4) public Integer buffLastTime = null;
    @Tag(tag=6) public Integer restSkillCount = null;
    @Tag(tag=15) public Integer killedMonsterCount = null;
}
