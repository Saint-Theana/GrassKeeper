package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MatchType.*;
import org.sorapointa.proto.MatchType;

public class PlayerStartMatchRsp {
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public Integer punishEndTime = null;
    @Tag(tag=4) public Integer param = null;
    @Tag(tag=13) public Integer mpPlayId = null;
    @Tag(tag=2) public Integer mechanicusDifficultLevel = null;
    @Tag(tag=3) public Integer dungeonId = null;
    @Tag(tag=8) public Integer matchId = null;
    @Tag(tag=7) public Integer matchType = null;
}
