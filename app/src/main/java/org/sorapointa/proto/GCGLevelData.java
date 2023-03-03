package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGLevelData {
    @Tag(tag=10) public List<Integer> finishedChallengeIdList = new ArrayList<>();
    @Tag(tag=9) public Integer levelId = null;
}
