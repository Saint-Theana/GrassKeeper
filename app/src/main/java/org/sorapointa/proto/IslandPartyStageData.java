package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IslandPartyStageData {
    @Tag(tag=5) public Integer bestScore = null;
    @Tag(tag=2) public Integer stageId = null;
    @Tag(tag=1) public Boolean isOpen = null;
}
