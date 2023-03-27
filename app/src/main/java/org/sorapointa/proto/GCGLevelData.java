package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGLevelData {
    @Tag(tag=13) public Integer levelId = null;
    @Tag(tag=4) public List<Integer> finishedChallengeIdList = new ArrayList<>();
}
