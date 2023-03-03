package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGTCTavernChallengeData.*;
import org.sorapointa.proto.GCGTCTavernChallengeData;

public class GCGTCTavernChallengeUpdateNotify {
    @Tag(tag=5) public GCGTCTavernChallengeData tavernChallenge = null;
}
