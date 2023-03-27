package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PotionDungeonResultInfo {
    @Tag(tag=12) public Integer modeId = null;
    @Tag(tag=1) public Integer difficultyLevel = null;
    @Tag(tag=6) public Integer leftTime = null;
    @Tag(tag=2) public Integer levelId = null;
    @Tag(tag=10) public Integer finalScore = null;
    @Tag(tag=9) public Integer stageId = null;
}
