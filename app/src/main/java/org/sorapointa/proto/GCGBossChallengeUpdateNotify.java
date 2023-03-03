package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGBossChallengeData.*;
import org.sorapointa.proto.GCGBossChallengeData;

public class GCGBossChallengeUpdateNotify {
    @Tag(tag=11) public GCGBossChallengeData bossChallenge = null;
}
