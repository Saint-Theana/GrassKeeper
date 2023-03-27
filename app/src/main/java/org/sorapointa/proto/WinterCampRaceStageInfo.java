package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WinterCampRaceStageInfo {
    @Tag(tag=10) public Vector pos = null;
    @Tag(tag=14) public Integer maxScore = null;
    @Tag(tag=11) public Integer openTime = null;
    @Tag(tag=15) public Integer id = null;
}
