package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGLevelChallengeFinishNotify {
    @Tag(tag=10) public List<Integer> finishedChallengeIdList = new ArrayList<>();
    @Tag(tag=15) public Integer levelId = null;
}
