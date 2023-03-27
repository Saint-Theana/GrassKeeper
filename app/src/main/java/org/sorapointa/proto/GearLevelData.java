package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GearLevelData {
    @Tag(tag=1) public Integer shortestTime = null;
    @Tag(tag=4) public Integer openTime = null;
    @Tag(tag=7) public Integer levelId = null;
    @Tag(tag=12) public Integer lastDuration = null;
    @Tag(tag=13) public Boolean isFinished = null;
    @Tag(tag=9) public Boolean isOpen = null;
}
