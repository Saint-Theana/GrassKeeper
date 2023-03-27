package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintageHuntingInfo {
    @Tag(tag=2) public Integer stageId = null;
    @Tag(tag=14) public FirstStageInfo firstStageInfo = null;
    @Tag(tag=11) public SecondStageInfo secondStageInfo = null;
    @Tag(tag=9) public ThirdStageInfo thirdStageInfo = null;
}
