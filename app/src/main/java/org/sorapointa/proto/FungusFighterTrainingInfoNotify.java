package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FungusFighterTrainingInfoNotify {
    public enum JBHPHCENNEO {
        @Tag(tag=0) None ,
        @Tag(tag=5545) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Integer buffLastTime = null;
    @Tag(tag=14) public Integer maxSkillCount = null;
    @Tag(tag=1) public Integer killedMonsterCount = null;
    @Tag(tag=7) public Integer restSkillCount = null;
    @Tag(tag=3) public Integer maxMonsterCount = null;
    @Tag(tag=6) public Integer buffId = null;
    @Tag(tag=13) public Integer buffStartTime = null;
}
