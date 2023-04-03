package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChannellerSlabBuffInfo.*;
import org.sorapointa.proto.ChannellerSlabBuffInfo;
import org.sorapointa.proto.ChannellerSlabLoopDungeonStageInfo.*;
import org.sorapointa.proto.ChannellerSlabLoopDungeonStageInfo;
import org.sorapointa.proto.ChannelerSlabChallengeStage.*;
import org.sorapointa.proto.ChannelerSlabChallengeStage;

public class ChannelerSlabActivityDetailInfo {
    @Tag(tag=13) public ChannellerSlabBuffInfo buffInfo = null;
    @Tag(tag=7) public Integer playEndTime = null;
    @Tag(tag=4) public ChannellerSlabLoopDungeonStageInfo loopDungeonStageInfo = null;
    @Tag(tag=9) public List<ChannelerSlabChallengeStage> stageList = new ArrayList<>();
}
