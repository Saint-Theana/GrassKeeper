package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class StartArenaChallengeLevelRsp {
    public enum StartArenaChallengeLevelRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2116) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public Integer arenaChallengeId = null;
    @Tag(tag=2) public Integer gadgetEntityId = null;
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public Integer arenaChallengeLevel = null;
}
