package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PotionLevelData {
    @Tag(tag=10) public Integer levelId = null;
    @Tag(tag=7) public Integer score = null;
    @Tag(tag=5) public Integer modeId = null;
    @Tag(tag=2) public Integer difficultyLevel = null;
}
