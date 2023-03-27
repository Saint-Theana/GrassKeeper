package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GravenInnocenceCampStageInfo {
    @Tag(tag=8) public Boolean isOpen = null;
    @Tag(tag=14) public Integer stageId = null;
    @Tag(tag=13) public Boolean isFinished = null;
    @Tag(tag=12) public Integer levelId = null;
}
