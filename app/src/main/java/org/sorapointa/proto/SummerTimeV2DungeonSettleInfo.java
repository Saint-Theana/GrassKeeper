package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SummerTimeV2DungeonSettleInfo {
    @Tag(tag=12) public Integer takenRewardCount = null;
    @Tag(tag=9) public Integer curDungeonRewardLimit = null;
    @Tag(tag=10) public Boolean isSuccess = null;
}
