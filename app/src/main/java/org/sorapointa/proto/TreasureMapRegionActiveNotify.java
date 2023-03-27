package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TreasureMapRegionActiveNotify {
    public enum TreasureMapRegionActiveNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2177) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Integer activeRegionIndex = null;
}
