package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class StartRogueEliteCellChallengeRsp {
    @Tag(tag=12) public Integer dungeonId = null;
    @Tag(tag=9) public Integer cellId = null;
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
}
