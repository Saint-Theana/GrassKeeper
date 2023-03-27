package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintageCampChallengeLevelData {
    @Tag(tag=11) public Boolean isOpen = null;
    @Tag(tag=6) public Boolean isFinish = null;
    @Tag(tag=8) public Integer stageId = null;
    @Tag(tag=9) public Integer levelId = null;
}
