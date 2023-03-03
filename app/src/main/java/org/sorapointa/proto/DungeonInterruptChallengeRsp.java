package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonInterruptChallengeRsp {
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public Integer challengeIndex = null;
    @Tag(tag=15) public Integer groupId = null;
    @Tag(tag=11) public Integer challengeId = null;
}
