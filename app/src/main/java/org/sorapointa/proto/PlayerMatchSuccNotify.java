package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGMatchInfo.*;
import org.sorapointa.proto.GCGMatchInfo;
import org.sorapointa.proto.GeneralMatchInfo.*;
import org.sorapointa.proto.GeneralMatchInfo;
import org.sorapointa.proto.MatchType.*;
import org.sorapointa.proto.MatchType;

public class PlayerMatchSuccNotify {
    @Tag(tag=7) public GeneralMatchInfo generalMatchInfo = null;
    @Tag(tag=15) public Integer mpPlayId = null;
    @Tag(tag=3) public Integer hostUid = null;
    @Tag(tag=5) public Integer matchType = null;
    @Tag(tag=11) public GCGMatchInfo gcgMatchInfo = null;
    @Tag(tag=2) public Integer confirmEndTime = null;
    @Tag(tag=6) public Integer dungeonId = null;
    @Tag(tag=1) public Integer mechanicusDifficultLevel = null;
}
