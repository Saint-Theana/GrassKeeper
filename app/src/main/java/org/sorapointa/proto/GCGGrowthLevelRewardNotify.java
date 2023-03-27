package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGGrowthLevelRewardNotify {
    public enum EGBNAKCLKLL {
        @Tag(tag=0) None ,
        @Tag(tag=7338) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public List<Integer> levelRewardTakenList = new ArrayList<>();
}
