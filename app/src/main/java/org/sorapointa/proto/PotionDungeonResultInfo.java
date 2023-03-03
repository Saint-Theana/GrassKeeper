package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PotionDungeonResultInfo {
    @Tag(tag=8) public Integer finalScore = null;
    @Tag(tag=9) public Integer leftTime = null;
    @Tag(tag=14) public Integer difficultyLevel = null;
    @Tag(tag=11) public Integer modeId = null;
    @Tag(tag=4) public Integer levelId = null;
    @Tag(tag=2) public Integer stageId = null;
}
