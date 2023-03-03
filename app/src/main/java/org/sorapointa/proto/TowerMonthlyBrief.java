package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TowerMonthlyBrief {
    @Tag(tag=15) public Integer towerScheduleId = null;
    @Tag(tag=6) public Integer bestFloorIndex = null;
    @Tag(tag=3) public Integer bestLevelIndex = null;
    @Tag(tag=12) public Integer totalStarCount = null;
}
