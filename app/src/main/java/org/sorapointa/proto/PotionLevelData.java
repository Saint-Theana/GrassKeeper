package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PotionLevelData {
    @Tag(tag=12) public Integer score = null;
    @Tag(tag=6) public Integer levelId = null;
    @Tag(tag=10) public Integer difficultyLevel = null;
    @Tag(tag=11) public Integer modeId = null;
}
