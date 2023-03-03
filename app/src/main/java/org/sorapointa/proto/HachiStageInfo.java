package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HachiStageInfo {
    @Tag(tag=8) public Boolean isOpen = null;
    @Tag(tag=12) public Boolean isFinished = null;
    @Tag(tag=5) public Integer openTime = null;
    @Tag(tag=14) public Integer stageId = null;
}
