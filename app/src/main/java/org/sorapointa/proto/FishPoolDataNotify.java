package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FishPoolDataNotify {
    public enum FishPoolDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5806) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer todayFishNum = null;
    @Tag(tag=5) public Integer entityId = null;
}
