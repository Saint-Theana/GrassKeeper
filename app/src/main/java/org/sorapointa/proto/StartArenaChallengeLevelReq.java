package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class StartArenaChallengeLevelReq {
    @Tag(tag=4) public Integer arenaChallengeId = null;
    @Tag(tag=5) public Integer gadgetEntityId = null;
    @Tag(tag=2) public Integer arenaChallengeLevel = null;
}
