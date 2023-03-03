package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGChallengeData {
    @Tag(tag=1) public Integer challengeId = null;
    @Tag(tag=2) public Integer challengeType = null;
    @Tag(tag=3) public List<Integer> paramList = new ArrayList<>();
    @Tag(tag=4) public Integer progress = null;
}
