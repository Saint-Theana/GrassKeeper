package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChannelerSlabBuffInfo.*;
import org.sorapointa.proto.ChannelerSlabBuffInfo;
import org.sorapointa.proto.ChannelerSlabChallengeStage.*;
import org.sorapointa.proto.ChannelerSlabChallengeStage;
import org.sorapointa.proto.ChannelerSlabLoopDungeonStageInfo.*;
import org.sorapointa.proto.ChannelerSlabLoopDungeonStageInfo;

public class ChannelerSlabActivityDetailInfo {
    @Tag(tag=1) public ChannelerSlabBuffInfo buffInfo = null;
    @Tag(tag=7) public ChannelerSlabLoopDungeonStageInfo loopDungeonStageInfo = null;
    @Tag(tag=15) public List<ChannelerSlabChallengeStage> stageList = new ArrayList<>();
    @Tag(tag=3) public Integer playEndTime = null;
}
