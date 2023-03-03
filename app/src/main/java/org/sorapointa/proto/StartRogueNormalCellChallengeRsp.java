package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class StartRogueNormalCellChallengeRsp {
    @Tag(tag=10) public Integer dungeonId = null;
    @Tag(tag=2) public Integer cellId = null;
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
}
