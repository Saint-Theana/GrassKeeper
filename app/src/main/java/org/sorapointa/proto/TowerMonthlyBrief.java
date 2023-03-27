package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TowerMonthlyBrief {
    @Tag(tag=11) public Integer bestLevelIndex = null;
    @Tag(tag=7) public Integer towerScheduleId = null;
    @Tag(tag=14) public Integer totalStarCount = null;
    @Tag(tag=8) public Integer bestFloorIndex = null;
}
