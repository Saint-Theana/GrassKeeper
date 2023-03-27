package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChallnelerSlabInfo {
    @Tag(tag=13) public ChannellerSlabBuffInfo buffInfo = null;
    @Tag(tag=7) public Integer playEndTime = null;
    @Tag(tag=4) public ChannellerSlabLoopDungeonStageInfo loopDungeonStageInfo = null;
    @Tag(tag=9) public List<ChannelerSlabChallengeStage> stageList = new ArrayList<>();
}
