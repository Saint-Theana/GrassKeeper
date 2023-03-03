package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SumoDungeonSettleNotify {
    @Tag(tag=7) public Integer finalScore = null;
    @Tag(tag=14) public Integer difficultyId = null;
    @Tag(tag=15) public Integer killEliteMonsterNum = null;
    @Tag(tag=12) public Integer stageId = null;
    @Tag(tag=4) public Integer killMonsterNum = null;
    @Tag(tag=5) public Boolean isNewRecord = null;
}
