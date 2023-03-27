package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintageHuntingStageData {
    @Tag(tag=12) public Boolean isOpen = null;
    @Tag(tag=11) public Boolean isFinish = null;
    @Tag(tag=10) public Integer stageId = null;
    @Tag(tag=1) public Integer openTime = null;
    @Tag(tag=2) public Integer recordValue = null;
}
