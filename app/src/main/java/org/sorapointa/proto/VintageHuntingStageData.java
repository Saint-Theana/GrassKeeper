package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintageHuntingStageData {
    @Tag(tag=10) public Integer openTime = null;
    @Tag(tag=3) public Boolean isFinish = null;
    @Tag(tag=9) public Boolean isOpen = null;
    @Tag(tag=12) public Integer recordValue = null;
    @Tag(tag=7) public Integer stageId = null;
}
