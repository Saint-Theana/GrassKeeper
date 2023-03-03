package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GravenInnocenceCampStageInfo {
    @Tag(tag=15) public Boolean isOpen = null;
    @Tag(tag=10) public Integer levelId = null;
    @Tag(tag=9) public Integer stageId = null;
    @Tag(tag=3) public Boolean isFinished = null;
}
