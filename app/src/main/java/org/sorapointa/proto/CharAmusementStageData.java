package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CharAmusementStageData {
    @Tag(tag=11) public Integer finishTime = null;
    @Tag(tag=12) public Integer stageId = null;
    @Tag(tag=9) public Boolean isOpen = null;
}
