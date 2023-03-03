package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintageCampChallengeLevelData {
    @Tag(tag=14) public Integer stageId = null;
    @Tag(tag=11) public Integer levelId = null;
    @Tag(tag=8) public Boolean isFinish = null;
    @Tag(tag=6) public Boolean isOpen = null;
}
