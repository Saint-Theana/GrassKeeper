package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IslandPartyStageData {
    @Tag(tag=13) public Integer stageId = null;
    @Tag(tag=14) public Boolean isOpen = null;
    @Tag(tag=4) public Integer bestScore = null;
}
