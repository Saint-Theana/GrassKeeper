package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class StartRogueNormalCellChallengeReq {
    @Tag(tag=3) public Integer dungeonId = null;
    @Tag(tag=8) public Integer cellId = null;
}
