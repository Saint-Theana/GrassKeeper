package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScoreChallengeInfo {
    @Tag(tag=13) public Integer salvageChallengeId = null;
    @Tag(tag=4) public Integer maxScore = null;
}
