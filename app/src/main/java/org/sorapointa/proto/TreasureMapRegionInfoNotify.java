package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TreasureMapRegionInfoNotify {
    public enum TreasureMapRegionInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2064) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public TreasureMapRegionInfo regionInfo = null;
}
