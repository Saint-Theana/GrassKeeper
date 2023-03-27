package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TeamChainStageData {
    @Tag(tag=6) public Integer bestScore = null;
    @Tag(tag=1) public Boolean isOpen = null;
    @Tag(tag=2) public Integer stageId = null;
}
