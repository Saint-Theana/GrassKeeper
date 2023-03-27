package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGTCTavernChallengeData {
    @Tag(tag=13) public List<Integer> unlockLevelIdList = new ArrayList<>();
    @Tag(tag=1) public Integer characterId = null;
}
