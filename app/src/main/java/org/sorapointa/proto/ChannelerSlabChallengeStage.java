package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChannelerSlabChallenge.*;
import org.sorapointa.proto.ChannelerSlabChallenge;
import org.sorapointa.proto.ChannelerSlabOneofDungeon.*;
import org.sorapointa.proto.ChannelerSlabOneofDungeon;

public class ChannelerSlabChallengeStage {
    @Tag(tag=3) public Integer openTime = null;
    @Tag(tag=14) public List<ChannelerSlabChallenge> challengeList = new ArrayList<>();
    @Tag(tag=7) public Boolean isOpen = null;
    @Tag(tag=9) public Integer stageId = null;
    @Tag(tag=13) public ChannelerSlabOneofDungeon dungeonInfo = null;
}
