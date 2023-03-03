package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class StartArenaChallengeLevelRsp {
    @Tag(tag=1) public Integer arenaChallengeLevel = null;
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public Integer gadgetEntityId = null;
    @Tag(tag=6) public Integer arenaChallengeId = null;
}
