package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannelerSlabLoopDungeonTakeScoreRewardRsp {
    @Tag(tag=12) public Integer rewardIndex = null;
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
}
