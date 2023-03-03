package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CharAmusementStageData {
    @Tag(tag=15) public Integer finishTime = null;
    @Tag(tag=12) public Boolean isOpen = null;
    @Tag(tag=6) public Integer stageId = null;
}
