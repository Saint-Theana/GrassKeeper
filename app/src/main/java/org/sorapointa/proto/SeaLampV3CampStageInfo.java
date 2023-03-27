package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SeaLampV3CampStageInfo {
    @Tag(tag=2) public Boolean isFinished = null;
    @Tag(tag=4) public Boolean isOpen = null;
    @Tag(tag=12) public Integer stageId = null;
    @Tag(tag=5) public Integer levelId = null;
}
