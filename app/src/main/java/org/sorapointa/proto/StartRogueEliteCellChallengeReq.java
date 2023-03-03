package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RogueEliteCellDifficultyType.*;
import org.sorapointa.proto.RogueEliteCellDifficultyType;

public class StartRogueEliteCellChallengeReq {
    @Tag(tag=1) public Integer difficulty = null;
    @Tag(tag=11) public Integer dungeonId = null;
    @Tag(tag=4) public Integer cellId = null;
}
