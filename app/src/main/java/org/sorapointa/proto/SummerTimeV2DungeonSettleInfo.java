package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SummerTimeV2DungeonSettleInfo {
    @Tag(tag=5) public Boolean isSuccess = null;
    @Tag(tag=2) public Integer takenRewardCount = null;
    @Tag(tag=11) public Integer curDungeonRewardLimit = null;
}
