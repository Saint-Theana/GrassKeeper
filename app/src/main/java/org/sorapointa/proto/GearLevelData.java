package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GearLevelData {
    @Tag(tag=8) public Integer shortestTime = null;
    @Tag(tag=11) public Integer openTime = null;
    @Tag(tag=5) public Integer lastDuration = null;
    @Tag(tag=12) public Integer levelId = null;
    @Tag(tag=9) public Boolean isFinished = null;
    @Tag(tag=3) public Boolean isOpen = null;
}
