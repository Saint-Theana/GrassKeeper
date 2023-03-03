package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGBossChallengeData {
    @Tag(tag=9) public Integer id = null;
    @Tag(tag=14) public List<Integer> unlockLevelIdList = new ArrayList<>();
}
