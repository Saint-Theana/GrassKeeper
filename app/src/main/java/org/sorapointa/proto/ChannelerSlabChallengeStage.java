package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannelerSlabChallengeStage {
    @Tag(tag=10) public Integer openTime = null;
    @Tag(tag=12) public List<ChannelerSlabChallenge> challengeList = new ArrayList<>();
    @Tag(tag=5) public ChannelerSlabOneoffDungeon dungeonInfo = null;
    @Tag(tag=13) public Integer stageId = null;
    @Tag(tag=1) public Boolean isOpen = null;
}
