package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SeaLampV3RaceLevelInfo {
    @Tag(tag=13) public Boolean isOpen = null;
    @Tag(tag=5) public Integer levelId = null;
    @Tag(tag=14) public Integer maxScore = null;
}
