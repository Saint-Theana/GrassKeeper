package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GeneralMatchInfo.*;
import org.sorapointa.proto.GeneralMatchInfo;
import org.sorapointa.proto.MatchType.*;
import org.sorapointa.proto.MatchType;
import org.sorapointa.proto.GCGMatchInfo.*;
import org.sorapointa.proto.GCGMatchInfo;

public class PlayerMatchSuccNotify {
    public enum PlayerMatchSuccNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4181) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public GeneralMatchInfo generalMatchInfo = null;
    @Tag(tag=7) public Integer mechanicusDifficultLevel = null;
    @Tag(tag=5) public Integer hostUid = null;
    @Tag(tag=8) public Integer dungeonId = null;
    @Tag(tag=9) public Integer confirmEndTime = null;
    @Tag(tag=14) public Integer mpPlayId = null;
    @Tag(tag=12) public Integer matchType = null;
    @Tag(tag=4) public GCGMatchInfo gcgMatchInfo = null;
}
