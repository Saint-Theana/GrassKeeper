package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGBossChallengeData {
    @Tag(tag=1) public List<Integer> unlockLevelIdList = new ArrayList<>();
    @Tag(tag=5) public Integer id = null;
}
