package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGTCTavernChallengeData.*;
import org.sorapointa.proto.GCGTCTavernChallengeData;

public class GCGTCTavernChallengeDataNotify {
    @Tag(tag=13) public List<GCGTCTavernChallengeData> tavernChallengeList = new ArrayList<>();
}
