package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SalvageScoreChallengeInfo {
    @Tag(tag=13) public Integer salvageChallengeId = null;
    @Tag(tag=7) public Integer maxScore = null;
}
